package ru.mirea.practice.s23k0114.lab1;


import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.IOException;


public class TwoThreeTree {
    private Node root;

    public void insert(Processor processor) {
        if (root == null) {
            root = new Node(true);
            root.keys.add(processor);
        } else {
            if (root.keys.size() == 2) {
                Node newRoot = new Node(false);
                newRoot.children.add(root);
                splitChild(newRoot, 0);
                root = newRoot;
            }
            insertNonFull(root, processor);
        }
    }

    private void insertNonFull(Node node, Processor processor) {
        int i = node.keys.size() - 1;

        if (node.isLeaf) {
            while (i >= 0 && processor.key < node.keys.get(i).key) {
                i--;
            }
            node.keys.add(i + 1, processor);
        } else {
            while (i >= 0 && processor.key < node.keys.get(i).key) {
                i--;
            }
            i++;
            if (node.children.get(i).keys.size() == 2) {
                splitChild(node, i);
                if (processor.key > node.keys.get(i).key) {
                    i++;
                }
            }
            insertNonFull(node.children.get(i), processor);
        }
    }

    private void splitChild(Node parent, int index) {
        Node fullChild = parent.children.get(index);
        Node newChild = new Node(fullChild.isLeaf);

        parent.keys.add(index, fullChild.keys.get(1));
        parent.children.add(index + 1, newChild);

        newChild.keys.add(fullChild.keys.remove(1));

        if (!fullChild.isLeaf) { // Если у дочернего узла есть дети
            newChild.children.add(fullChild.children.remove(1));
            newChild.children.add(fullChild.children.remove(1));
        }
    }

    public void display() {
        if (root == null) {
            System.out.println("Дерево пустое.");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            if (currentNode.isLeaf) {
                for (Processor key : currentNode.keys) {
                    System.out.print(key.key + " ");
                }
            } else {
                // Если это не листовой узел, печатаем ключи и символы
                for (int i = 0; i < currentNode.keys.size(); i++) {
                    System.out.print(currentNode.keys.get(i).key);
                    if (i < currentNode.keys.size() - 1) {
                        System.out.print(" - ");
                    }
                }
            }

            System.out.println();

            for (Node child : currentNode.children) {
                queue.add(child);
            }
        }
    }

    public void delete(int key) {
        if (root == null) {
            System.out.println("Дерево пустое.");
            return;
        }

        delete(root, key);

        if (root.keys.isEmpty()) {
            root = root.isLeaf ? null : root.children.get(0);
        }
    }

    private void delete(Node node, int key) {
        int idx = findKey(node, key);

        if (idx < node.keys.size() && node.keys.get(idx).key == key) {
            if (node.isLeaf) {
                node.keys.remove(idx);
            } else {
                deleteInternalNode(node, idx);
            }
        } else { // Ключ не найден
            if (node.isLeaf) {
                System.out.println("Ключ не найден.");
                return;
            }

            boolean isLastChild = idx == node.keys.size();
            Node child = node.children.get(isLastChild ? idx - 1 : idx);

            if (child.keys.size() < 1) {
                fill(idx, node);
            }

            if (isLastChild && idx > node.keys.size()) {
                delete(node.children.get(idx - 1), key);
            } else {
                delete(child, key);
            }
        }
    }

    private void deleteInternalNode(Node node, int idx) {
        Processor key = node.keys.get(idx);

        if (node.children.get(idx).keys.size() >= 1) {
            Processor predecessor = getPredecessor(node, idx);
            node.keys.set(idx, predecessor);
            delete(node.children.get(idx), predecessor.key);
        } else if (node.children.get(idx + 1).keys.size() >= 1) {
            Processor successor = getSuccessor(node, idx);
            node.keys.set(idx, successor);
            delete(node.children.get(idx + 1), successor.key);
        } else {
            merge(node, idx);
            delete(node.children.get(idx), key.key);
        }
    }

    private Processor getPredecessor(Node node, int idx) {
        Node current = node.children.get(idx);

        while (!current.isLeaf) {
            current = current.children.get(current.keys.size());
        }

        return current.keys.get(current.keys.size() - 1);
    }

    private Processor getSuccessor(Node node, int idx) {
        Node current = node.children.get(idx + 1);

        while (!current.isLeaf) {
            current = current.children.get(0);
        }

        return current.keys.get(0);
    }

    private void merge(Node parent, int idx) {
        Node leftChild = parent.children.get(idx);
        Node rightChild = parent.children.get(idx + 1);

        leftChild.keys.add(parent.keys.remove(idx));
        leftChild.keys.addAll(rightChild.keys);

        if (!leftChild.isLeaf) {
            leftChild.children.addAll(rightChild.children);
        }

        parent.children.remove(idx + 1);
    }

    private int findKey(Node node, int key) {
        int idx = 0;

        while (idx < node.keys.size() && node.keys.get(idx).key < key) {
            ++idx;
        }

        return idx;
    }

    private void fill(int index, Node parent) {
        if (index != 0 && parent.children.get(index - 1).keys.size() >= 1) {
            borrowFromPrev(index, parent);
        } else if (index != parent.keys.size() && parent.children.get(index + 1).keys.size() >= 1) {
            borrowFromNext(index, parent);
        } else {
            if (index != parent.keys.size()) {
                merge(parent, index);
            } else {
                merge(parent, index - 1);
            }
        }
    }

    private void borrowFromPrev(int index, Node parent) {
        Node child = parent.children.get(index);
        Node sibling = parent.children.get(index - 1);

        child.keys.add(0, parent.keys.get(index - 1));

        parent.keys.set(index - 1, sibling.keys.remove(sibling.keys.size() - 1));

        if (!child.isLeaf) {
            child.children.add(0, sibling.children.remove(sibling.children.size() - 1));
        }
    }

    private void borrowFromNext(int index, Node parent) {
        Node child = parent.children.get(index);
        Node sibling = parent.children.get(index + 1);

        child.keys.add(parent.keys.get(index));

        parent.keys.set(index, sibling.keys.remove(0));

        if (!child.isLeaf) {
            child.children.add(sibling.children.remove(0));
        }
    }

    public void readFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                Processor processor = new Processor(
                        Integer.parseInt(parts[0]),
                        parts[1],
                        Double.parseDouble(parts[2]),
                        Integer.parseInt(parts[3]),
                        Double.parseDouble(parts[4]),
                        Integer.parseInt(parts[5]),
                        Integer.parseInt(parts[6])
                );
                insert(processor);
            }
        }

    }

    public void processCommands() throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Введите команду (L - показать, D n - удалить, A n - добавить, S - сохранить, E - выйти): ");
                String command = scanner.nextLine().trim();

                if ("L".equalsIgnoreCase(command)) {
                    display(); // Показать дерево
                } else if (command.startsWith("D ")) {
                    int key = Integer.parseInt(command.split(" ")[1]);
                    delete(key); // Удалить запись с ключом n
                } else if (command.startsWith("A ")) {
                    int key = Integer.parseInt(command.split(" ")[1]);
                    // Запрос данных у пользователя для новой записи
                    System.out.print("Введите название процессора: ");
                    String name = scanner.nextLine();

                    System.out.print("Введите тактовую частоту (ГГц): ");
                    double frequency = Double.parseDouble(scanner.nextLine());

                    System.out.print("Введите размер кеш-памяти (Кб): ");
                    int cacheSize = Integer.parseInt(scanner.nextLine());

                    System.out.print("Введите частоту системной шины (ГГц): ");
                    double busFrequency = Double.parseDouble(scanner.nextLine());

                    System.out.print("Введите результат теста SPECint: ");
                    int specint = Integer.parseInt(scanner.nextLine());

                    System.out.print("Введите результат теста SPECfp: ");
                    int specfp = Integer.parseInt(scanner.nextLine());

                    Processor processor = new Processor(key, name, frequency, cacheSize, busFrequency, specint, specfp);
                    insert(processor);
                } else if ("S".equalsIgnoreCase(command)) {
                    saveToFile("PROCS.TXT");
                } else if ("E".equalsIgnoreCase(command)) {
                    break;
                } else {
                    System.out.println("Неизвестная команда. Попробуйте снова.");
                }
            }
        }



    }

    public void saveToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            saveNode(writer, root);
        }

    }

    private void saveNode(BufferedWriter writer, Node node) throws IOException {
        if (node != null) {
            for (Processor key : node.keys) {
                writer.write(key.key + "," + key.name + "," + key.frequency + ","
                        + key.cacheSize + "," + key.busFrequency + ","
                        + key.specint + "," + key.specfp);
                writer.newLine();
            }
            if (!node.isLeaf) {
                for (Node child : node.children) {
                    saveNode(writer, child);
                }
            }
        }
    }
}

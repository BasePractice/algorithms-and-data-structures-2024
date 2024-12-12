package ru.mirea.practice.s23k0155;

import java.util.LinkedList;
import java.util.Queue;


public class TwoThreeTree {
    Node root;

    public Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (root.isLeaf()) {
            root.addKeyInNode(key);
        } else if (key <= root.key[0]) {
            root.first = insert(root.first, key);
        } else if (root.numberOfKeys == 1 || root.numberOfKeys == 2 && key <= root.key[1]) {
            root.second = insert(root.second, key);
        } else {
            root.third = insert(root.third, key);
        }
        return split(root);
    }

    Node split(Node node) {
        if (node.numberOfKeys < 3) {
            return node;
        }
        Node x = new Node(node.key[0], node.first, node.second, null, null, node.parents);
        Node y = new Node(node.key[2], node.third, node.fourth, null, null, node.parents);

        // Устанавливаем правильных родителей
        if (x.first != null) {
            x.first.parents = x;
        }

        if (x.second != null) {
            x.second.parents = x;
        }

        if (y.first != null) {
            x.first.parents = y;
        }

        if (y.second != null) {
            y.second.parents = y;
        }

        if (node.parents != null) {
            node.parents.addKeyInNode(node.key[1]);
            // Убираем ссылку на разделяемый узел из родительского узла
            if (node.parents.first == node) {
                node.parents.first = null;
            } else if (node.parents.second == node) {
                node.parents.second = null;
            } else if (node.parents.third == node) {
                node.parents.third = null;
            }

            // Обновляем ссылки на дочерные узлы в родительском узле
            if (node.parents.first == null) {
                node.parents.fourth = node.parents.third;
                node.parents.third = node.parents.second;
                node.parents.second = y;
                node.parents.first = x;
            } else if (node.parents.second == null) {
                node.parents.fourth = node.parents.third;
                node.parents.third = y;
                node.parents.second = x;
            } else {
                node.parents.fourth = y;
                node.parents.third = x;
            }

            Node temp = node.parents;
            node = null;
            return temp;
        } else {
            x.parents = node;
            y.parents = node;
            node.becomeNode2(node.key[1], x, y);
            return node;
        }
    }

    // Поиск ключа
    Node search(Node node, int key) {
        if (node == null) {
            return null;
        }

        if (node.find(key)) {
            return node;
        } else if (key < node.key[0]) {
            return search(node.first, key);
        } else if (node.numberOfKeys == 2 && key < node.key[1] || node.numberOfKeys == 1) {
            return search(node.second, key);
        } else if (node.numberOfKeys == 2) {
            return search(node.third, key);
        }
        return null;
    }

    //  Поиск минимального ключа
    Node searchMin(Node node) {
        if (node == null) {
            return node;
        }

        if (node.first == null) {
            return node;
        } else {
            return searchMin(node.first);
        }
    }

    //  Удаление ключа
    Node remove(Node node, int key) {
        Node item = search(node, key);

        if (item == null) {
            return node;
        }

        Node min = null;
        if (item.key[0] == key) {
            min = searchMin(item.second);
        } else {
            min = searchMin(item.third);
        }

        if (min != null) {
            int z = key == item.key[0] ? item.key[0] : item.key[1];
            item.swap(z, min.key[0]);
            item = min;
        }

        item.deleteKeyFromNode(key);
        return fix(item);
    }

    // Исправление дерева после удаления ключа
    Node fix(Node node) {
        if (node.numberOfKeys == 0 && node.parents == null) {
            return null;
        }

        if (node.numberOfKeys != 0) {
            if (node.parents != null) {
                return fix(node.parents);
            } else {
                return node;
            }
        }

        Node parent = node.parents;
        if (parent.first.numberOfKeys == 2 || parent.second.numberOfKeys == 2 || parent.numberOfKeys == 2) {
            node = redistribute(node);
        } else if (parent.numberOfKeys == 2 && parent.third.numberOfKeys == 2) {
            node = redistribute(node);
        } else {
            node = merge(node);
        }
        return fix(node);
    }

    //  Перераспределение
    Node redistribute(Node leaf) {
        Node parent = leaf.parents;
        Node first = parent.first;
        Node second = parent.second;
        Node third = parent.third;

        if (parent.numberOfKeys == 2 && first.numberOfKeys < 2 && second.numberOfKeys < 2
            && third.numberOfKeys < 2) {

            if (first == leaf) {
                parent.first = parent.second;
                parent.second = parent.third;
                parent.third = null;
                parent.first.addKeyInNode(parent.key[0]);
                parent.first.third = parent.first.second;
                parent.first.second = parent.first.first;


                if (leaf.first != null) {
                    parent.first.first = leaf.first;
                } else if (leaf.second != null) {
                    parent.first.first = leaf.second;
                }

                if (parent.first.parents == null) {
                    parent.first.first.parents = parent.first;
                }

                parent.deleteKeyFromNode(parent.key[0]);
                first = null;

            } else if (second == leaf) {
                first.addKeyInNode(parent.key[0]);
                parent.deleteKeyFromNode(parent.key[0]);
                if (leaf.first != null) {
                    first.third = leaf.first;
                } else if (leaf.second != null) {
                    first.third = leaf.second;
                }

                if (first.third != null) {
                    first.third.parents = first;
                }
                parent.second = parent.third;
                parent.third = null;
                second = null;

            } else if (third == leaf) {
                second.addKeyInNode(parent.key[1]);
                parent.third = null;
                parent.deleteKeyFromNode(parent.key[1]);

                if (leaf.first != null) {
                    second.third = leaf.first;
                } else if (leaf.second != null) {
                    second.third = leaf.second;
                }

                if (second.third != null) {
                    second.third.parents = second;
                }
                third = null;
            }
        } else if (parent.numberOfKeys == 2 && (first.numberOfKeys == 2
            || second.numberOfKeys == 2 || third.numberOfKeys == 2)) {

            if (third == leaf) {

                if (leaf.first != null) {
                    leaf.second = leaf.first;
                    leaf.first = null;
                }

                leaf.addKeyInNode(parent.key[1]);

                if (second.numberOfKeys == 2) {
                    parent.key[1] = second.key[1];
                    leaf.first = second.third;
                    second.third = null;

                    if (leaf.first != null) {
                        leaf.first.parents = leaf;
                    }
                } else if (first.numberOfKeys == 2) {
                    parent.key[1] = second.key[0];
                    leaf.first = second.second;
                    second.second = second.first;

                    if (leaf.first != null) {
                        leaf.first.parents = leaf;
                    }

                    second.key[0] = parent.key[0];
                    parent.key[0] = first.key[1];
                    first.deleteKeyFromNode(first.key[1]);
                    second.first = first.third;

                    if (second.first != null) {
                        second.first.parents = second;
                    }
                    first.third = null;
                }


            } else if (second == leaf) {

                if (third.numberOfKeys == 2) {

                    if (leaf.first == null) {
                        leaf.first = leaf.second;
                        leaf.second = null;
                    }

                    second.addKeyInNode(parent.key[1]);
                    parent.key[1] = third.key[0];
                    third.deleteKeyFromNode(third.key[0]);
                    second.second = third.first;

                    if (second.second != null) {
                        second.second.parents = second;
                    }
                    third.first = third.second;
                    third.second = third.third;
                    third.third = null;
                } else if (first.numberOfKeys == 2) {
                    if (leaf.second == null) {
                        leaf.second = leaf.first;
                        leaf.first = null;
                    }
                    second.addKeyInNode(parent.key[0]);
                    parent.key[0] = first.key[1];
                    first.deleteKeyFromNode(first.key[1]);
                    second.first = first.third;
                    if (second.first != null) {
                        second.first.parents = second;
                    }
                    first.third = null;
                }


            } else if (first == leaf) {

                if (leaf.first == null) {
                    leaf.first = leaf.second;
                    leaf.second = null;
                }
                first.addKeyInNode(parent.key[0]);

                if (second.numberOfKeys == 2) {
                    parent.key[0] = second.key[0];
                    second.deleteKeyFromNode(second.key[0]);
                    first.second = second.first;

                    if (first.second != null) {
                        first.second.parents = first;
                    }
                    second.first = second.second;
                    second.second = second.third;
                    second.third = null;
                } else if (third.numberOfKeys == 2) {
                    parent.key[0] = second.key[0];
                    second.key[0] = parent.key[1];
                    parent.key[1] = third.key[0];
                    third.deleteKeyFromNode(third.key[0]);
                    first.second = second.first;

                    if (first.second != null) {
                        first.second.parents = first;
                    }
                    second.first = second.second;
                    second.second = third.first;

                    if (second.second != null) {
                        second.second.parents = second;
                    }
                    third.first = third.second;
                    third.second = third.third;
                    third.third = null;
                }
            }
        } else if (parent.numberOfKeys == 1) {
            leaf.addKeyInNode(parent.key[0]);

            if (first == leaf && second.numberOfKeys == 2) {
                parent.key[0] = second.key[0];
                second.deleteKeyFromNode(second.key[0]);

                if (leaf.first == null) {
                    leaf.first = leaf.second;
                }
                leaf.second = second.first;
                second.first = second.second;
                second.second = second.third;
                second.third = null;

                if (leaf.second != null) {
                    leaf.second.parents = leaf;
                }
            } else if (second == leaf && first.numberOfKeys == 2) {
                parent.key[0] = first.key[1];
                first.deleteKeyFromNode(first.key[1]);

                if (leaf.second == null) {
                    leaf.second = leaf.first;
                }
                leaf.first = first.third;
                first.third = null;

                if (leaf.first != null) {
                    leaf.first.parents = leaf;
                }
            }
        }
        return parent;
    }

    //  Склеивание
    Node merge(Node leaf) {
        Node parent = leaf.parents;

        if (parent.first == leaf) {
            parent.second.addKeyInNode(parent.key[0]);
            parent.second.third = parent.second.second;
            parent.second.second = parent.second.first;

            if (leaf.first != null) {
                parent.second.first = leaf.first;
            } else if (leaf.second != null) {
                parent.second.first = leaf.second;
            }

            if (parent.second.first != null) {
                parent.second.first.parents = parent.second;
            }
            parent.deleteKeyFromNode(parent.key[0]);
            parent.first = null;
        } else if (parent.second == leaf) {
            parent.first.addKeyInNode(parent.key[0]);

            if (leaf.first != null) {
                parent.first.third = leaf.first;
            } else if (leaf.second != null) {
                parent.first.third = leaf.second;
            }

            if (parent.first.third != null) {
                parent.first.third.parents = parent.first;
            }
            parent.deleteKeyFromNode(parent.key[0]);
            parent.second = null;
        }

        if (parent.parents == null) {
            Node temp = null;
            if (parent.first != null) {
                temp = parent.first;
            } else {
                temp = parent.second;
            }
            temp.parents = null;
            parent = null;
            return temp;
        }

        return parent;
    }

    public void printTree() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Количество узлов на текущем уровне
            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                System.out.print(current + " "); // Печатаем текущий узел

                if (current.first != null) {
                    queue.add(current.first);
                }
                if (current.second != null) {
                    queue.add(current.second);
                }
                if (current.third != null) {
                    queue.add(current.third);
                }
            }
            System.out.println();
        }
    }
}

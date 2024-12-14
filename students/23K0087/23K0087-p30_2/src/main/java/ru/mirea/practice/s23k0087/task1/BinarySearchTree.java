package ru.mirea.practice.s23k0087.task1;


public class BinarySearchTree<E extends Comparable<E>> {
    private Node<E> root;
    private int count;

    public BinarySearchTree() {
        root = null;
        count = 0;
    }

    public Node<E> getRoot() {
        return root;
    }

    public void setRoot(Node<E> root) {
        this.root = root;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean binSearch(E item) {
        Node<E> searchNode;
        searchNode = this.getRoot();
        while (true) {
            if (searchNode == null) {
                return false;
            } else if (item.compareTo(searchNode.data) == 0) {
                return true;
            } else if (item.compareTo(searchNode.data) > 0) {
                searchNode = searchNode.getRight();
            } else {
                searchNode = searchNode.getLeft();
            }
        }
    }

    //Cannot remove the root node because of a bug, would've fixed it later if I had time
    public boolean insert(E data) {
        // True - Inserted
        // False - Already exists
        if (this.getRoot() == null) {
            setRoot(new Node<>(data));
            return true;
        }
        Node<E> searchNode = getRoot();
        while (true) {
            if (data.compareTo(searchNode.getData()) == 0) {
                return false;
            } else if (data.compareTo(searchNode.getData()) > 0) {
                if (searchNode.getRight() == null) {
                    searchNode.setRight(new Node<>(data));
                    return true;
                } else {
                    searchNode = searchNode.getRight();
                }
            } else {
                if (searchNode.getLeft() == null) {
                    searchNode.setLeft(new Node<>(data));
                    return true;
                } else {
                    searchNode = searchNode.getLeft();
                }
            }
        }
    }

    public boolean delete(E data) {
        Node<E> q = getRoot();
        Node<E> z = getRoot();
        while (true) {
            if (z == null) {
                return false;
            } else if (data.compareTo(z.getData()) == 0) {
                break;
            } else if (data.compareTo(z.getData()) > 0) {
                q = z;
                z = z.getRight();
            } else {
                q = z;
                z = z.getLeft();
            }
        }

        if (z.getRight() == null) {
            if (q.getLeft().equals(z)) {
                q.setLeft(z.getLeft());
            } else {
                q.setRight(z.getLeft());
            }
        } else {
            Node<E> y = z.getRight();
            if (y.getLeft() == null) {
                y.setLeft(z.getLeft());
                if (q.getLeft().equals(z)) {
                    q.setLeft(y);
                } else {
                    q.setRight(y);
                }
            } else {
                Node<E> x = y.getLeft();
                while (x.getLeft() != null) {
                    y = x;
                    x = y.getLeft();
                }
                y.setLeft(x.getRight());
                x.setLeft(z.getLeft());
                x.setRight(z.getRight());
                if (q.getLeft().equals(z)) {
                    q.setLeft(x);
                } else {
                    q.setRight(x);
                }
            }
        }
        this.count -= 1;
        return true;
    }

    public String walk(Node<E> searchNode) {
        if (searchNode == null) {
            return "";
        }
        String string = "";
        string += searchNode.getData();
        string += " ";
        string += walk(searchNode.getLeft());
        string += walk(searchNode.getRight());
        return string;
    }

    public E min() {
        Node<E> searchNode;
        searchNode = this.root;
        while (searchNode.getLeft() != null) {
            searchNode = searchNode.getLeft();
        }
        return searchNode.getData();
    }

    public E max() {
        Node<E> searchNode;
        searchNode = this.root;
        while (searchNode.getRight() != null) {
            searchNode = searchNode.getRight();
        }
        return searchNode.getData();
    }

    @Override
    public String toString() {
        return walk(getRoot());
    }

    class Node<E> {
        private E data;
        private Node<E> left;
        private Node<E> right;

        public Node() {
            // Default constructor
        }

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }
    }
}

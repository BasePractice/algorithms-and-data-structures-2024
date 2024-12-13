package ru.mirea.practice.lab30.t1;

public abstract class Main {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(15);
        root1.left.left = new TreeNode(2);
        root1.left.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(15);
        root2.left.left = new TreeNode(2);
        root2.left.right = new TreeNode(7);

        TreeNode root3 = new TreeNode(10);
        root3.left = new TreeNode(5);
        root3.right = new TreeNode(20);
        root3.left.left = new TreeNode(2);
        root3.left.right = new TreeNode(7);

        System.out.println("Высота первого дерева: " + BinaryTreeHeight.height(root1));
        System.out.println("Размер первого дерева: " + BinaryTreeSize.size(root1));
        System.out.println("Максимальная ширина первого дерева: " + BinaryTreeWidth.getMaxWidth(root1));

        System.out.println("Поиск узла 7 в первом дереве: " + BinaryTreeLookup.lookup(root1, 7));
        System.out.println("Поиск узла 100 в первом дереве: " + BinaryTreeLookup.lookup(root1, 100));

        System.out.println("Два дерева одинаковые? " + BinaryTreeComparison.sameTree(root1, root2));
        System.out.println("Первое и третье дерево одинаковые? " + BinaryTreeComparison.sameTree(root1, root3));

        BinaryTreeReverse.reverse(root1);
        System.out.println("Первое дерево было перевёрнуто");
    }
}


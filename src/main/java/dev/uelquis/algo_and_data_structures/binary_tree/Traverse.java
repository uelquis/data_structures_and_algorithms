package dev.uelquis.algo_and_data_structures.binary_tree;

public final class Traverse {
    private Traverse() {}

    public interface NodeTraverse {
        void op(Node node);
    }

    public static void preOrder(Node tree, NodeTraverse fn) {
        fn.op(tree);

        if (tree.leftNode != null) preOrder(tree.leftNode, fn);

        if (tree.rightNode != null) preOrder(tree.rightNode, fn);
    }

    public static void inOrder(Node tree, NodeTraverse fn) {

        if (tree.leftNode != null) inOrder(tree.leftNode, fn);

        fn.op(tree);

        if (tree.rightNode != null) inOrder(tree.rightNode, fn);
    }

    public static void postOrder(Node tree, NodeTraverse fn) {
        if (tree.leftNode != null) postOrder(tree.leftNode, fn);

        if (tree.rightNode != null) postOrder(tree.rightNode, fn);

        fn.op(tree);
    }
}

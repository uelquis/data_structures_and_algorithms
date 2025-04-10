package dev.uelquis.algo_and_data_structures.binary_tree;

public final class Node <T> {
    public final T key;
    public final Node<T> leftNode, rightNode;

    public Node(T key, Node<T> leftNode, Node<T> rightNode) {
        this.key = key;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public Node(T key) {
        this.key = key;
        this.leftNode = null;
        this.rightNode = null;
    }
}

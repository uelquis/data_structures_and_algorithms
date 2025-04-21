package dev.uelquis.algo_and_data_structures;

import dev.uelquis.algo_and_data_structures.binary_tree.Node;
import dev.uelquis.algo_and_data_structures.binary_tree.Traverse;
import org.junit.jupiter.api.Test;

public class TraverseTests {
    final Node<Integer> tree = new Node<Integer>(10,
            new Node<Integer>(6,
                    new Node<Integer>(3),
                    new Node<Integer>(8)
            ),
            new Node<Integer>(14));

    @Test
    void traversePreOrder() {
        Traverse.preOrder(tree, (Node n) -> {
            System.out.println("key: " + n.key);
        });
    }

    @Test
    void traverseInOrder() {
        Traverse.inOrder(tree, (Node n) -> {
            System.out.println("key: " + n.key);
        });
    }

    @Test
    void traversePostOrder() {
        Traverse.postOrder(tree, (Node n) -> {
            System.out.println("key: " + n.key);
        });
    }
}

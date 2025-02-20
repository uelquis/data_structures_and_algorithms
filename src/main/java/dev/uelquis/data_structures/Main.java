package dev.uelquis.data_structures;

import dev.uelquis.data_structures.binary_tree.*;

public class Main {
    public static void main(String[] args) {
        var t = new Tree<Integer>();

        var tree = new Node<Integer>(10,
                new Node<Integer>(8,
                        new Node<Integer>(2),
                        new Node<Integer>(9)
                ),
                new Node<Integer>(14));

        t.searchBSTPreOrder(9,
                tree,
                node -> node.key,
                pair -> (pair.getValue0() <= pair.getValue1()),
                currentKey -> System.out.printf("key %d\n", currentKey)
                );
    }
}
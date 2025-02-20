package dev.uelquis.data_structures.binary_tree;

import org.javatuples.Pair;

import java.util.function.Consumer;
import java.util.function.Function;

public class Tree <T> {
    private Node<T> root;

    public Tree() {}

    public void searchBSTPreOrder(
            T searchedKey,
            Node<T> node,
            Function<Node<T>, T> getNodeKey,
            Function<Pair<T, T>, Boolean> compare,
            Consumer<T> operation
    ) {
        if(node == null) return;
        T key = getNodeKey.apply(node);
        if(key == null) return;

        operation.accept(key);

        if(searchedKey.equals(key)) {
            StringBuilder builder = new StringBuilder();
            builder.append("key ").append(key).append(" found!");
            System.out.println(builder.toString());
            return;
        }

        Boolean willSearchLeft = compare.apply(new Pair<>(searchedKey, key));

        if(!willSearchLeft) {
            this.searchBSTPreOrder(searchedKey, node.rightNode, getNodeKey, compare, operation);
        }
        else {
            this.searchBSTPreOrder(searchedKey, node.leftNode, getNodeKey, compare, operation);
        }
    }
}

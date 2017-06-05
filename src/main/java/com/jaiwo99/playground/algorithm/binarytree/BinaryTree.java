package com.jaiwo99.playground.algorithm.binarytree;

public class BinaryTree {

    public Node build(String[] words) {
        Node node = new Node(words[0]);

        for (int i = 1; i < words.length; i++) {
            node.put(words[i]);
        }

        return node;
    }
}

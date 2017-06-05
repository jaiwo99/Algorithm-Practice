package com.jaiwo99.playground.algorithm.binarytree;

public class Node {

    public Node(String value) {
        this.value = value;
    }

    public String value;
    public Node left;
    public Node right;

    public void put(String word) {
        if ( value.compareTo(word) > 0 ) {

            if (left != null) {
                left.put(word);
            } else {
                left = new Node(word);
            }

        } else if (value.compareTo(word) < 0) {
            if (right != null) {
                right.put(word);
            } else {
                right = new Node(word);
            }
        }
    }
}

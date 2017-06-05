package com.jaiwo99.playground.algorithm.fibonacci;

public class Fibonacci {

    public void printNumbers(int count) {


        int[] store = new int[count];
        for (int i = 0; i < count; i++) {
            if (i < 2) {
                store[i] = i;
            } else {
                store[i] = store[i-2] + store[i-1];
            }
        }

        System.out.println(store);
    }
}

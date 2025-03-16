package com.company.programmers;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int n = 5;

        int[][] arr = new int[n][n];
        for (int i=0; i< arr.length; i++){
            Arrays.fill(arr[i],1);
        }

        for (int i=0; i< arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}

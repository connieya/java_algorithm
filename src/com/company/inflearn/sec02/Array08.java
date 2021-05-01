package com.company.inflearn.sec02;

import java.util.Scanner;

public class Array08 {

    public static void main(String[] args) {

        int[] array = new int[]{89, 100, 30, 15, 84};
        for (int i = 0; i < array.length; i++) {
            int rank = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    rank++;
                }
            }
            System.out.print("arrau[" + i + "] =" + array[i]);
            array[i] = rank;
            System.out.println(" " + array[i]);

        }
    }
}

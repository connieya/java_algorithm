package com.company.test;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        int arr[][] = new int[size][size];
        int counter = 1 , nDirection = 1;
        int x = 0;
        int y = -1;
        for (int nLength = 2 * size - 1; nLength > 0; nLength -= 2) {
            for (int i = 0; i < nLength; i++) {
                if (i < nLength / 2 + 1) {
                    y += nDirection;
                } else {
                    x += nDirection;
                }
                arr[x][y] = counter++;
            }
            nDirection = -nDirection;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

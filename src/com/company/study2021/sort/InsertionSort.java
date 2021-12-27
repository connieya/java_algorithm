package com.company.study2021.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        for (int i = 1; i < array.length; i++) {
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[index]) {
                    int temp = array[index];
                    array[index] = array[j];
                    array[j] = temp;
                    index = j;
                } else {
                    break;
                }

            }
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}

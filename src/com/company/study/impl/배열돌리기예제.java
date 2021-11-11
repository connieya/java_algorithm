package com.company.study.impl;

import java.util.Arrays;

public class 배열돌리기예제 {
    public static void main(String[] args) {
        int arr1[][] = {{1, 2, 4, 10}, {2, 4, 1, 2}};
        int arr2[][] = {{2,1},{4,2},{1,4},{2,10}};

        arr1 = arr2;
        System.out.println(Arrays.deepToString(arr1));
    }
}

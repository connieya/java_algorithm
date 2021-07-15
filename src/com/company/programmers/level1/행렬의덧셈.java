package com.company.programmers.level1;

public class 행렬의덧셈 {
    public static void main(String[] args) {
        int arr1[][] = {{1,2}, {2,3}};
        int arr2[][] = {{3,4}, {5,6}};

        int arr3[][] = new int[arr1.length][arr1[0].length];
        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr1[i].length; j++){
                arr3[i][j] =arr1[i][j]+arr2[i][j];
            }
        }

    }
}

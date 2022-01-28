package com.company.programmers.level3;

import java.util.Arrays;

public class 자물쇠와열쇠 {
    public static void main(String[] args) {
        char arr[][] = {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
        for (int i=0; i<4; i++){
           arr =  rotate90degree(arr);
            System.out.println(Arrays.deepToString(arr));
        }

    }

    public static char[][] rotate90degree(char arr[][]) {
        int n = arr.length;
        char temp[][] = new char[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                temp[i][j] = arr[n-j-1][i];
            }
        }
        return temp;
    }
}

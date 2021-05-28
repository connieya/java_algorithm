package com.company.baekjoon.math2;

import java.util.Scanner;

public class Main_3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][2];
        for (int i=0; i<3; i++){
            for (int j=0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int x ,y;
        if (arr[0][0] == arr[1][0]){
            x = arr[2][0];
        }else if(arr[0][0] == arr[2][0]){
            x = arr[1][0];
        }else {
            x = arr[0][0];
        }

        if (arr[1][1] ==arr[0][1]){
            y = arr[2][1];
        }else if (arr[0][1] == arr[2][1]){
            y = arr[1][1];
        }else {
            y = arr[0][1];
        }

        System.out.println(x+" "+y);

    }
}

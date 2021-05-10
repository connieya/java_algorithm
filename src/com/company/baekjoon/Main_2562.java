package com.company.baekjoon;

import java.util.Scanner;

public class Main_2562 {
    public static void main(String[] args) {
        int [] arr = new int[9];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<9; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int c = 0;
        for (int i=0; i<9; i++){
            if (arr[i] > max){
                max = arr[i];
                 c = i+1;
            }
        }
        System.out.print(max+"\n"+c);


    }
}

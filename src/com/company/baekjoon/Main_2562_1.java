package com.company.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_2562_1 {
    public static void main(String[] args) throws IOException {
        int [] arr = new int[9];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }


        int max = Integer.MIN_VALUE;
        int c = 0;
        for (int i=0; i<9; i++){
            if (arr[i] > max){
                max = arr[i];
                 c = i+1;
            }
        }
        System.out.println(max);
        System.out.println(c);

    }
}

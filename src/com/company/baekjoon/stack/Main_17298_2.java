package com.company.baekjoon.stack;

import java.util.Scanner;

public class Main_17298_2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] seq = new int[n];
        int []arr = new int[n];

        int top =-1;
        for (int i=0; i<n; i++){

            while (top != -1 && seq[arr[top]] < seq[i]){
                seq[arr[top]] = seq[i];
                top--;
            }
            top++;
            arr[top] = i;
        }

        for (int i =top; i>= 0; i--){
            seq[arr[i]] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for (int v : seq){
            sb.append(v).append(' ');
        }
        System.out.println(sb);
    }
}

package com.company.baekjoon.for_;


import java.util.Scanner;
public class Main_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++){
            int c = sc.nextInt();
            if (x > c){
                sb.append(c+" ");
            }
        }
        System.out.println(sb);
    }
}

package com.company.codility;

import java.util.Scanner;

public class Task3 {
    public static int consecutive(int n){

        String str = String.valueOf(n);
        for (int i=0; i<str.length()-1; i++){
            if (str.charAt(i)==str.charAt(i+1)){
               consecutive(n+1);
            }
        }

        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
}

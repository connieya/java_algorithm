package com.company.baekjoon;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int arr[] = new int[str.length()];

        for (int i=0; i<str.length(); i++){
            arr[i] = str.charAt(i)-48;
        }

        for (int c : arr){
            System.out.println(c);
        }

    }
}

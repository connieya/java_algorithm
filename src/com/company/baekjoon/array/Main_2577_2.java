package com.company.baekjoon.array;

import java.util.Scanner;

public class Main_2577_2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int value = a * b * c;

        int arr[] = new int[10];

       while (value!=0){
           arr[value%10]++;
           value /= 10;
       }
       for (int i : arr){
           System.out.println(i);
       }


    }
}

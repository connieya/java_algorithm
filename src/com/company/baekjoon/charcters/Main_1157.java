package com.company.baekjoon.charcters;

import java.util.HashMap;
import java.util.Scanner;

public class Main_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = str.toUpperCase();

        int [] arr = new int[26];

        for (int i=0; i<s.length(); i++){
            arr[(s.charAt(i)-'A')]++;
        }
        int min  = Integer.MIN_VALUE;
        char ch = '?';

        for (int i=0; i<arr.length; i++){
            if (arr[i] > min){
                min = arr[i];
                ch = (char) (i+65);
            }else if (arr[i] ==min){
                ch = '?';
            }
        }
        System.out.println(ch);



    }
}

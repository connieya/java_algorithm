package com.company.baekjoon;

import java.util.Scanner;

public class Main_1406 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char arr[]  = new char[10];

        String str = sc.next();
        for (int i=0; i<str.length(); i++){
            arr[i] = str.charAt(i);
        }

        int m = sc.nextInt();
        int cursor = str.length();
        int len = str.length()-1;
        for (int j=0; j<m; j++){
            String next = sc.next();
            if (next.equals("P")){
                if (cursor == len){
                    arr[cursor] = sc.next().charAt(0);
                }
                len++;
                arr[len] = arr[len-1];
                arr[cursor] = sc.next().charAt(0);

            }else if (next.equals("L")){
                if (cursor == 0) cursor = 0;
                cursor--;

            }else if(next.equals("D")){
                if (cursor == str.length()) cursor =str.length();
                cursor++;
            }
        }


        for (char c : arr){
            System.out.print(c);
        }

    }
}

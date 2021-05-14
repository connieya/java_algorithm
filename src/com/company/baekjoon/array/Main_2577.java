package com.company.baekjoon.array;

import java.util.Scanner;

public class Main_2577 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int value = a * b * c;

        String str = String.valueOf(value);

        for (int i = 0; i <= 9; i++) {
          int count =0;
          for (char ch : str.toCharArray()){
                if ( (ch -48) == i) count++;
          }
            System.out.println(count);
        }

    }
}

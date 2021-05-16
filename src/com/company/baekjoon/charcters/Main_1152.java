package com.company.baekjoon.charcters;

import java.util.Scanner;

public class Main_1152 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        String[] s = str.split(" ");

            if (str.isEmpty()){
                System.out.println(0);
            }
            System.out.println(s.length);

    }
}


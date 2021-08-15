package com.company.baekjoon.implement;

import java.util.Scanner;

public class 카이사르암호_5598 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String caesarWord = sc.nextLine();
        String answer = "";
        for (char c : caesarWord.toCharArray()) {
            int i = c;
            if (i <= 67) {
                answer += (char)(i+23);
            } else {
                answer += (char)(i-3);
            }
        }
        System.out.println(answer);
    }
}

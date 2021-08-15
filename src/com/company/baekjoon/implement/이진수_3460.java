package com.company.baekjoon.implement;
import java.util.Scanner;

public class 이진수_3460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int value = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            while (value > 0) {
                sb.append(value % 2);
                value /= 2;
            }
            for (int i = 0; i < sb.toString().length(); i++) {
                if (sb.toString().charAt(i) == '1') {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

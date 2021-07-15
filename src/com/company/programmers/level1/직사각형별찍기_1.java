package com.company.programmers.level1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 직사각형별찍기_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<a; i++){
            sb.append("*");
        }
        for (int j=0; j<b; j++){
            System.out.println(sb.toString());
        }
    }
}

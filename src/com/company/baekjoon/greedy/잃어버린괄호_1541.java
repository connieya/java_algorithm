package com.company.baekjoon.greedy;

import java.util.Scanner;

public class 잃어버린괄호_1541 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = Integer.MAX_VALUE;
        int temp = 0;
        String[] subtraction = in.nextLine().split("-");
        for (String str : subtraction){
            String[] add = str.split("\\+");
            for (String  s: add){
                temp += Integer.parseInt(s);
            }
            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }

        System.out.println(sum);
    }
}

package com.company.programmers.level1;

public class 정수제곱근판별_1 {
    public static void main(String[] args) {
        int n = 3;
        long answer =-1;
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
             answer = (long) Math.pow(Math.sqrt(n) + 1, 2);
        };

        System.out.println(answer);
    }
}

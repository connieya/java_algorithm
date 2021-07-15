package com.company.programmers.level1;

public class 정수제곱근판별_2 {
    public static void main(String[] args) {
        int n = 121;
        double sqrt = Math.sqrt(n);

        double floor = Math.floor(sqrt);
        System.out.println(floor);
        long answer = Math.floor(sqrt) == sqrt ? (long) Math.pow(sqrt+1,2) : -1;
        System.out.println(answer);
    }
}

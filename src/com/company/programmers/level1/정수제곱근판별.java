package com.company.programmers.level1;

public class 정수제곱근판별 {
    public static void main(String[] args) {
        int n = 121;
        double sqrt = Math.sqrt(n);
        double v = sqrt - (int) sqrt;
        System.out.println(v);
        long answer = 0;
        answer = (long) ((long) (sqrt+1)*(sqrt+1));
        System.out.println(answer);
    }
}

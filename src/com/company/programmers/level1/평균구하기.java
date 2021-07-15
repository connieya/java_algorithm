package com.company.programmers.level1;

import java.util.Arrays;

public class 평균구하기 {
    public static void main(String[] args) {
        int []arr = { 1,2,3,4};
        double v = Arrays.stream(arr).average().orElse(0);
        System.out.println(v);

    }
}

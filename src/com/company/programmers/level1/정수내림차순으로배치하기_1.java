package com.company.programmers.level1;

import java.util.Arrays;

public class 정수내림차순으로배치하기_1 {
    public static void main(String[] args) {
        int n = 118372;
        String[] split = String.valueOf(n).split("");
        Arrays.sort(split);
        for (String ch :split){
            System.out.print(ch +" ");

        }
    }
}

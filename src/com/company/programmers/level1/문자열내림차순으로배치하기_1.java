package com.company.programmers.level1;

import java.util.Arrays;

public class 문자열내림차순으로배치하기_1 {
    public static void main(String[] args) {
        String s = "Zbcdeafg";
        char [] array = s.toCharArray();
        Arrays.sort(array);
        new StringBuilder(new String(array)).reverse().toString();
    }
}


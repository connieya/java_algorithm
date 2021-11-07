package com.company.kakao2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        String alpha[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String s = "23four5six7";
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                sb.append(ch);
                str = "";
                continue;
            }
            str += ch;
            int index = Arrays.asList(alpha).indexOf(str);
            if (index != -1) {
                sb.append(index);
                str = "";
            }
        }

        System.out.println(sb.toString());

    }
}

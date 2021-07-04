package com.company.test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_03 {
    public static void main(String[] args) {
        String s = "abcxyqwertyxyabc";
        System.out.println(s.length());
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0, s.length() / 2));
        System.out.println(sb);
        System.out.println("---------------");
        StringTokenizer st = new StringTokenizer(sb.toString());
    }
}

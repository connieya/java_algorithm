package com.company.study.main;

public class Swap {
    public static void main(String[] args) {
        String s1 = "sibal";
        String s2 = "sekki";
        System.out.println(s1 + " " + s2);
        swap(s1,s2);
        System.out.println(s1 + " " + s2);
    }

    public static void swap(String str1, String str2) {
        String temp = str2;
        str2 = str1;
        str1 = temp;
    }
}

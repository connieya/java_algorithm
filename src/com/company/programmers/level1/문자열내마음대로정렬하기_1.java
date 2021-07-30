package com.company.programmers.level1;

import java.util.*;

public class 문자열내마음대로정렬하기_1 {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n)>o2.charAt(n)) return 1;
                else if (o1.charAt(n)==o2.charAt(n)) return o1.compareTo(o2);
                else if (o1.charAt(n)<o2.charAt(n)) return -1;
                else return 0;
            }
        });
        for (String string : strings) {
            System.out.print(string+" ");
        }
    }

}

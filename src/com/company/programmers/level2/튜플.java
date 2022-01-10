package com.company.programmers.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 튜플 {
    public static void main(String[] args) {
        Set<String > set = new HashSet<>();
        String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        String arr[] = s.replaceAll("[{]", " ")
                .replaceAll("[}]", " ")
                .trim()
                .split(" , ");
        Arrays.sort(arr, (a, b) -> {
            return a.length() - b.length();
        });
        int [] answer = new int[arr.length];
        int idx = 0;
        for (String s1 : arr) {
            for (String  s2 : s1.split(",")) {
                if (set.add(s2)) {
                    answer[idx++] = Integer.parseInt(s2);
                }
            }
        }

    }


}

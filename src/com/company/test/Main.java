package com.company.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> apartment = new HashMap<>();
        int answer = 0;
        int[][] passwords = {
                {101, 9999},
                {102, 1111},
        };
        for (int i = 0; i < passwords.length; i++) {
            apartment.put(passwords[i][0], passwords[i][1]);
        }
        String s = "101#9999#102#1111#101#9999#101#9999#";
        String[] split = s.split("#");
        for (int i = 0; i < split.length - 1; i++) {
            if (apartment.get(Integer.valueOf(split[i])) == null) continue;

            if (apartment.get(Integer.valueOf(split[i])).equals(Integer.valueOf(split[i + 1]))) {
                answer++;
                i++;
            } else {
                i++;
            }
        }

        System.out.println(answer);
    }

}

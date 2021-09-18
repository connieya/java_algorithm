package com.company.programmers.test;

import java.util.*;

public class 위클리4주차_직업군 {
    public static void main(String[] args) {
        String[] languages = {"JAVA", "JAVASCRIPT"};
        int preference[] = {7, 5};
        String table[] = {
                "SI JAVA JAVASCRIPT SQL PYTHON C#",
                "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
                "HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
                "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
                "GAME C++ C# JAVASCRIPT C JAVA"
        };
        int scores[] = new int[table.length];
        for (int i = 0; i < table.length; i++) {
            String[] jobs = table[i].split(" ");
            int sum = 0;
            for (int j = 0; j < languages.length; j++) {
                int index = Arrays.asList(jobs).indexOf(languages[j]);
                if (index != -1) {
                    sum += preference[j] * (6 - index);
                }
            }
            scores[i] = sum;
        }
        int max = Arrays.stream(scores)
                .max()
                .getAsInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (max == scores[i]) {
                list.add(table[i].split(" ")[0]);
            }
        }
        String any = list.stream()
                .sorted()
                .findAny()
                .get();


        System.out.println(any);

    }
}

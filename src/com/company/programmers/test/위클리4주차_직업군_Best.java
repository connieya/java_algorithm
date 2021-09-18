package com.company.programmers.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 위클리4주차_직업군_Best {
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
        String answer = "";
        int score = -1;
        for (int i = 0; i < table.length; i++) {
            String[] jobs = table[i].split(" ");
            int sum = 0;
            for (int j = 0; j < languages.length; j++) {
                int index = Arrays.asList(jobs).indexOf(languages[j]);
                if (index != -1) {
                    sum += preference[j] * (6 - index);
                }
                if (sum == score && answer.compareTo(jobs[0]) > 0 ) {
                    answer =  jobs[0];
                }
                if (sum > score) {
                    score =sum;
                    answer = jobs[0];
                }
            }
        }
        System.out.println(answer);

    }
}

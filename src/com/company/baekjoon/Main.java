package com.company.baekjoon;

import java.util.*;

public class Main {
    public static boolean isValid(String str) {
        for (char ch : str.toCharArray()) {
            if (!Character.isAlphabetic(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String S[] = {"team_name",  "application_name",  "error_level",  "message"};
        String logs[] = {"team_name : db application_name : dbtest error_level : info message : test", "team_name : test application_name : I DONT CARE error_level : error message : x", "team_name : ThisIsJustForTest application_name : TestAndTestAndTestAndTest error_level : test message : IAlwaysTestingAndIWillTestForever", "team_name : oberervability application_name : LogViewer error_level : error"};
        int answer = 0;
        for (int k = 0; k < logs.length; k++) {
            String L[] = logs[k].split(" ");
            boolean flag = false;
            int len = L.length;
            if (logs[k].length() >= 100 || len < 12){
                answer++;
                continue;
            }

            for (int i = 0; i < len; i++) {
                if (i <= 10 && i % 3 == 0) {
                    if (!S[i / 3].equals(L[i])) {
                        System.out.println("log index : "+k+" string index : "+i +" -- " +L[i]+ " -- " +S[i/3]);
                        flag = true;
                        break;
                    }
                }
                if ( (i+1) % 3 == 0 && !isValid(L[i])) {
                    System.out.println("log index : "+k+" string index : "+i);
                    flag = true;
                    break;
                }

            }
//            System.out.println(flag + " " + logs[k]);
            if (flag) {
                answer++;
            }
        }
        System.out.println(answer);

    }
}

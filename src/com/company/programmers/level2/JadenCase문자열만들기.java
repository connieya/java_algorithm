package com.company.programmers.level2;

import java.util.Locale;

public class JadenCase문자열만들기 {
    public static void main(String[] args) {
        String s = "apple sugar";
        s = s.toLowerCase();
        String[] str = s.split("");
        boolean check = true;
        String answer = "";
        for (String ss : str){
            answer+= check ? ss.toUpperCase() : ss;
            check = ss.equals(" ") ? true : false;
        }
        System.out.println(answer);

    }
}

package com.company.inflearn.sec01;

import java.util.Scanner;

public class String07_1 {
    public String solution(String str){

        char[] s = str.toCharArray();

        int len = str.length() - 1;
        for (int i=0 ; i<str.length(); i++){
            if (Character.toLowerCase(s[i]) !=  Character.toLowerCase(s[len-i])){
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        String07_1 S = new String07_1();
        System.out.println(S.solution(input));
    }
}

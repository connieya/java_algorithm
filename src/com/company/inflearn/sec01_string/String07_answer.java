package com.company.inflearn.sec01_string;

import java.util.Scanner;

public class String07_answer {

    public String solution(String str){
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();

        for (int i = 0; i<len/2; i++){
            if (str.charAt(i) != str.charAt(len-i-1)){
                return "NO";
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        String07_answer S = new String07_answer();

        System.out.println(S.solution(input));

    }
}

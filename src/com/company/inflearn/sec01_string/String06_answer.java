package com.company.inflearn.sec01_string;


import java.util.Scanner;

public class String06_answer {

    public String solution(String str) {

        String answer = "";

        for (int i=0; i < str.length(); i++){

            if (i == str.indexOf(str.charAt(i))){
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String06_answer S = new String06_answer();
        System.out.println(S.solution(input));






    }
}

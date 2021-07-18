package com.company.inflearn.sec01_string;

import java.util.Scanner;

public class String02_answer {

    public String solution(String input){


        String answer = "";

//        for (char c : input.toCharArray()){
//
//            if (Character.isLowerCase(c)){
//                answer += Character.toUpperCase(c);
//
//            }else{
//                answer += Character.toLowerCase(c);
//            }
//        }
        for (char c: input.toCharArray()){
            if (c >= 65 && c < 97){ // 대문자
                answer += (char)(c+32);
            }else{
                answer += (char)(c-32);
            }
        }


        return answer;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        String02_answer t = new String02_answer();

        System.out.println(t.solution(input));
    }
}

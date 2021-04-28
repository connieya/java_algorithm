package com.company.inflearn.sec01;

import java.util.Scanner;

public class String09_answer {
    public int solution(String str) {

        String answer = "0";

        for (char x : str.toCharArray() ){
            if (Character.isDigit(x)){
                answer +=  x;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        String09 T = new String09();
        System.out.println(T.solution(input));

    }
}

package com.company.inflearn.sec01_string;

import java.util.Scanner;

public class String07 {

    public String solution(String str){

        String reverse = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reverse)){
            return "YES";
        }

        return "NO";

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();


        String07 S = new String07();
        System.out.println(S.solution(input));


    }
}

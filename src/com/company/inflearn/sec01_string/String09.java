package com.company.inflearn.sec01_string;

import java.util.Scanner;

public class String09 {
    public int  solution(String str){

        String answer = "";

        for (int i=0; i < str.length(); i++){
            if (Character.getType(str.charAt(i)) == 9){
                answer += str.charAt(i);
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

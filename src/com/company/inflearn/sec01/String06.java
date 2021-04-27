package com.company.inflearn.sec01;

import java.util.Scanner;

public class String06 {

    public String solution(String str){

        String answer = "";

        char[] s = str.toCharArray();

        answer += str.substring(0,1);
        int i =1;
        while (i < str.length()){
            if (answer.contains(str.substring(i,i+1))){
                i++;
            }else{

                answer += str.substring(i,i+1);
                i++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String input = kb.next();

        String06 S = new String06();

        System.out.println(S.solution(input));


    }
}

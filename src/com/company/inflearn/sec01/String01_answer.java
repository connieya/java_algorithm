package com.company.inflearn.sec01;

import java.util.Scanner;

public class String01_answer {
    public int solution(String input1 , char input2) {

        String s = input1.toUpperCase();
        char c = Character.toUpperCase(input2);
        int count = 0;
//        for (int i =0; i < s.length(); i++){
//
//            if (s.charAt(i) == c){
//                count++;
//            }
//        }
        for (char i : s.toCharArray()){
            if (c == i){
                count++;
            }
        }

        return count;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);


        String01_answer T = new String01_answer();
        System.out.println(T.solution(input1 , input2));

    }

}


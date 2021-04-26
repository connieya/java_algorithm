package com.company.inflearn.sec01;


import java.util.Scanner;

class String03_answer {
    public String solution(String str){
        String answer ="";
        int m = Integer.MIN_VALUE;

        String [] s = str.split(" ");
        for (String x : s){
            int len = x.length();
            if (len > m){
                m = len;
                answer =x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String03_answer s = new String03_answer();

        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(s.solution(str));

    }
}

package com.company.inflearn.sec01;

import java.util.Scanner;

public class String11_answer {
    public String solution(String str) {
        String answer = "";
        str += " ";
        int cnt = 1;
        for (int i=0; i<str.length()-1; i++){
            if (str.charAt(i) == str.charAt(i+1)) cnt ++;
            else{
                answer += str.charAt(i);
                if (cnt >1) answer += cnt;
                cnt = 1;
            }

        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String next = sc.next();

        String11_answer T = new String11_answer();
        System.out.println(T.solution(next));
    }
}

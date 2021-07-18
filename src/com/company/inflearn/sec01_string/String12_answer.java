package com.company.inflearn.sec01_string;

import java.util.Scanner;

public class String12_answer {

    public String solution(String s, int n) {

        String answer = "";

        for (int i=0; i<n; i++){
            String tmp = s.substring(0, 7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp,2);
            answer += (char)num;
            s = s.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = sc.next();


        String12_answer S = new String12_answer();
        System.out.println(S.solution(str, num));

    }
}

package com.company.inflearn.sec01_string;

import java.util.Scanner;

public class String08_answer {
    public String solution(String str) {
        String answer ="NO";

        str = str.toUpperCase().replaceAll("[^A-Z]","");
                                                // 대문자 알파벳이 아니면 전부 빈 문자 ""로 해라

        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) answer ="YES";

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String08_answer T = new String08_answer();
        System.out.println(T.solution(str));
    }
}

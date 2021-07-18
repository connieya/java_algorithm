package com.company.inflearn.sec01_string;

import java.util.Scanner;

class String03_answer2 {
    public String solution(String str) {
        String answer = "";

        int pos;
        int len = Integer.MIN_VALUE;

        while ((pos = str.indexOf(" ")) != -1) {

            String tmp = str.substring(0, pos);
            if (tmp.length() > len){
                len = tmp.length();
                answer = tmp;
            }

            str = str.substring(pos + 1);

        }
        // while문 끝나고 , 제일 마지막 단어는 공백이 없어서 비교를 못하기 때문에
        // 한번 더 비교를 한다.
        if (str.length() > len) answer = str;

            return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String03_answer2 S = new String03_answer2();
        System.out.println(S.solution(input));

    }
}

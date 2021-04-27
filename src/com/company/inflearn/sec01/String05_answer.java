package com.company.inflearn.sec01;

import java.util.Scanner;

class String05_answer {
    public String solution(String x) {

        char[] chars = x.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;

        while (lt < rt) {

            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char tmp = chars[rt];
                chars[rt] = chars[lt];
                chars[lt] = tmp;

                lt++; rt--;

            }
        }
        String answer = String.valueOf(chars);
        return answer;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String05_answer s = new String05_answer();

        System.out.println(s.solution(input));
    }
}

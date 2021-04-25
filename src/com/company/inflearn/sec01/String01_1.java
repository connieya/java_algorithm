package com.company.inflearn.sec01;

import java.util.Scanner;

class Main {

    public int solution(int count) {

        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);
        int count = 0;

        // 대소문자 구분 하지 않는 코드
        String c1 = input1.toUpperCase();
        char c2 = Character.toUpperCase(input2);

        for (int i = 0; i < c1.length(); i++) {
            if (c1.charAt(i) == c2) {
                count += 1;
            }


        }
            Main T = new Main();
            T.solution(count);
            System.out.println(T.solution(count));
    }

}
package com.company.inflearn.sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String10 {
    public String solution(String str, char c) {
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                num.add(i);
            }
        }
        String answer = "";
        for (int j = 0; j < str.length(); j++) {
            int min = Math.abs(j - num.get(0));
            for (int z = 0; z < num.size(); z++) {
                if (min > Math.abs(j - num.get(z))) {
                    min = Math.abs(j - num.get(z));
                }
            }
            answer += min + " ";

        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input1 = sc.next();
        char input2 = sc.next().charAt(0);

        String10 S = new String10();
        System.out.println(S.solution(input1, input2));

    }

}

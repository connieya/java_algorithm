package com.company.baekjoon;

import java.util.Scanner;

public class Main_9012_2 {

    public static String isValid(String s) {


        int count = 0;
        String answer = "YES";
        for (char c : s.toCharArray()) {
            if (c == '(')  count++;
            else {
                if (count==0) {
                    answer = "NO";
                    break;
                }
                count--;
            }
        }
        if (count >0) answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(isValid(sc.next()));
        }
    }
}

package com.company.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_01_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> answer = new ArrayList<>();
        long n = sc.nextLong();
        if (n == 1) {
            answer.add(0L);
            answer.add(1L);

            if (n % 7 == 0) {
                answer.add(2 * (n / 7));
                answer.add(2 * (n / 7));
            } else if ((n + 1) % 7 == 0) {
                answer.add((2 * (n + 1) / 7) - 1);
                answer.add(2 * (n + 1) / 7);
            } else if ((n - 1) % 7 == 0) {
                answer.add((2 * (n - 1) / 7));
                answer.add((2 * (n - 1) / 7) + 1);
            } else {
                answer.add(2 * (n / 7));
                answer.add(2 * (n / 7) + 2);
            }
        }
        System.out.println(answer);

    }
}

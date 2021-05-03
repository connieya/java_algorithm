package com.company.inflearn.sec03;

import java.util.Scanner;

public class Tow3 {

    public int solution(int n1, int n2, int[] array) {

        int answer = 0;
        for (int i = 0; i <= n1 - n2; i++) {
            int sum = 0;
            for (int j = i; j < n2 + i; j++) {

                sum += array[j];
            }
           answer=  Math.max(answer,sum);
        }

        return answer;
    }

    public static void main(String[] args) {

        Tow3 T = new Tow3();

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int array[] = new int[n1];

        for (int i = 0; i < n1; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println(T.solution(n1, n2, array));

    }
}

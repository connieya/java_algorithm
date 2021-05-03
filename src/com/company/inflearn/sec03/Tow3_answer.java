package com.company.inflearn.sec03;

import java.util.Scanner;

public class Tow3_answer {
    public int solution(int n, int k, int[] array) {

        int answer = 0 , sum =0;

        for (int i=0; i<k; i++){
            sum += array[i];
        }
            answer = sum;
        for (int i=k; i<n; i++){
            sum += (array[i]-array[i-k]);

            answer = Math.max(answer,sum);
        }


        return answer;
    }

    public static void main(String[] args) {

        Tow3_answer T = new Tow3_answer();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, k, array));

    }
}

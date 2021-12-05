package com.company.inflearn.sec02_array;

import java.util.Scanner;

public class 임시반장정하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int student[][] = new int[N+1][6];
        for (int i=1; i<=N;i++){
            for (int j=1; j<=5; j++){
                student[i][j]= sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        int answer =0;
        for (int i=1; i<=N; i++){
            int count =0;
            for (int j=1; j<=N; j++){
                for (int k=1; k<=5; k++) {
                    if (i==j){
                        continue;
                    }
                    if (student[i][k] == student[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (count >max){
                max = count;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}

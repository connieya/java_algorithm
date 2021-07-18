package com.company.inflearn.sec02_array;

import java.util.Scanner;

public class 임시반장정하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int student[][] = new int[N][5];
        for (int i=0; i<N;i++){
            for (int j=0; j<5; j++){
                student[i][j]= sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        int answer =0;
        boolean check[] = new boolean[N];
        for (int k=0; k<N;k++){
            int count =0;
            for (int i=0; i<5;i++){
                for (int j=0; j<N; j++){
                    if (student[k][i] == student[j][i] && !check[j]){
                        count++;
                    }
                }
            }
            if (count> max){
                max = count;
                answer=k+1;
            }
        }
        System.out.println(answer);
    }
}

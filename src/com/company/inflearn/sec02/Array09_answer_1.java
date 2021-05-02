package com.company.inflearn.sec02;

import java.util.Scanner;

public class Array09_answer_1 {

    public int solution(int num , int[][]arr){

        int answer = Integer.MIN_VALUE;
        int sum1 , sum2;
        int sum3 =0,sum4 =0;
        for (int i=0; i<num; i++){
            sum1 =0; sum2 =0;
            sum3 += arr[i][i];
            sum4 += arr[i][num-1-i];

            for (int j=0; j<num; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer,sum1);
            answer = Math.max(answer,sum2);
        }
        answer= Math.max(answer,sum3);
        answer = Math.max(answer,sum4);

        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int array[][] = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                array[i][j] = sc.nextInt();
            }
        }

        Array09_answer_1 A = new Array09_answer_1();
        System.out.println(A.solution(n,array));




    }
}

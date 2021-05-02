package com.company.inflearn.sec02;

import java.util.ArrayList;
import java.util.Scanner;

public class Array09_answer {

    public int solution(int num , int[][]arr){

        int answer = Integer.MIN_VALUE;
        int sum1 , sum2;
        for (int i=0; i<num; i++){
            sum1 =0; sum2 =0;
            for (int j=0; j<num; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer,sum1);
            answer = Math.max(answer,sum2);
        }
        sum1 = sum2 =0;
        for (int i=0; i<num; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][num-1-i];
        }
        answer = Math.max(answer,sum1);
        answer = Math.max(answer,sum2);

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

        Array09_answer A = new Array09_answer();
        System.out.println(A.solution(n,array));




    }
}

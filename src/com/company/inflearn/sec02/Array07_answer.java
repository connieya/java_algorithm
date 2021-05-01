package com.company.inflearn.sec02;

import java.util.ArrayList;
import java.util.Scanner;

public class Array07_answer {
    public int solution(int n , int[]arr){
        int answer =0;
        int cnt =0;

        for (int i=0; i<n; i++){
            if (arr[i]  ==1){
                cnt++;
                answer +=cnt;
            }else {
                cnt = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Array07_answer A = new Array07_answer();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int [] arr = new int[num];
        for (int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(A.solution(num , arr));



    }
}

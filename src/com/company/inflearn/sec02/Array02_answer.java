package com.company.inflearn.sec02;

import java.util.Scanner;

public class Array02_answer {
    public int solution(int n , int[] arr){
        int answer =1 , max = arr[0];
        for (int i=1; i<n; i++){
            if (arr[i]>max){
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int array[] = new int[num];
        for (int i=0; i<num; i++){
            array[i] = sc.nextInt();
        }

        Array02_answer A = new Array02_answer();
        System.out.println(A.solution(num, array));
    }
}

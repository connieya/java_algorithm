package com.company.inflearn.sec02;

import java.util.Scanner;

public class Array08_answer {

    public int[] solution(int n , int arr[]){
        int[] answer = new int[n];
        for (int i=0; i<n; i++){
            int cnt =1;
            for (int j=0; j<n; j++){
                if (arr[j]>arr[i]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }

    public static void main(String[] args) {

        Array08_answer A = new Array08_answer();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int array[] = new int[num];
        for (int i=0; i< num; i++){
            array[i] = sc.nextInt();
        }



        for (int x : A.solution(num, array)){
            System.out.print(x +" ");
        }
    }
}

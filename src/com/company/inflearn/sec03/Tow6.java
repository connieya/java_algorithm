package com.company.inflearn.sec03;

import java.util.Scanner;

public class Tow6 {

    public int solution(int n , int[] arr){
       int count = 0, answer =0 , lt =0;

       for (int rt=0; rt<n; rt++){
           if(arr[rt] ==1){
               count++;
           }else {
               answer = Math.max(answer,count);

               count = 0;
           }
       }


        return answer;
    }

    public static void main(String[] args) {

        Tow6 T = new Tow6();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n,arr));

    }
}

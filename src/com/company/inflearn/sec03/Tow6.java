package com.company.inflearn.sec03;

import java.util.Scanner;

public class Tow6 {

    public int solution(int n , int[] arr){
        int count = 1;
        int answer = 1;
        int lt = 1;
        for (int rt=0; rt<n; rt++){
            if (arr[rt] ==0){
                lt++;
            }else if (arr[rt] == arr[lt]){
                count++; lt++;

                answer = Math.max(count,answer);
            }else {
                answer = Math.max(count, answer);

                count = 1;
                lt++;
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

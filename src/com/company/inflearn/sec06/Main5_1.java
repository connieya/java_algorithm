package com.company.inflearn.sec06;

import java.util.Scanner;

public class Main5_1 {


    public String solution(int n, int arr[]) {

        String answer = "U";

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-1; j++) {
               if (arr[j] == arr[j+1]) return "D";
               int tmp = arr[j+1];
               arr[j+1] = arr[j];
               arr[j] = tmp;
            }
        }

        return answer;


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Main5_1 T = new Main5_1();
        System.out.println(T.solution(n, arr));
    }
}

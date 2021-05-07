package com.company.inflearn.sec06;

import java.util.Scanner;

public class Main5 {


    public String solution(int n, int arr[]) {

        String answer = "U";

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) return "D";
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

        Main5 T = new Main5();
        System.out.println(T.solution(n, arr));
    }
}

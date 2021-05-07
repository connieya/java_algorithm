package com.company.inflearn.sec06;

import java.util.Arrays;
import java.util.Scanner;

public class Main5_a_1 {


    public String solution(int n, int arr[]) {

        String answer = "U";

        Arrays.sort(arr);
        // 오름 차순 정렬 끝
        for (int k=0; k<n-1; k++){
            if (arr[k] == arr[k+1]) return  "D";
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

        Main5_a_1 T = new Main5_a_1();
        System.out.println(T.solution(n, arr));
    }
}

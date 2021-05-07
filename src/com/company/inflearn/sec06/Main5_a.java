package com.company.inflearn.sec06;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main5_a {


    public String solution(int n, int arr[]) {

        String answer = "U";

        for (int i=1; i<n; i++){
            int tmp = arr[i] , j;
            for ( j=i-1; j>=0; j--){
                if (arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }
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

        Main5_a T = new Main5_a();
        System.out.println(T.solution(n, arr));
    }
}

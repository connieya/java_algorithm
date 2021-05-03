package com.company.inflearn.sec03;

import java.util.Scanner;

public class Tow4_answer {

    public int solution(int n, int m, int arr[]) {
       int answer =0 ,sum = 0 , lt =0;
       for (int rt=0; rt<n; rt++){
           sum+= arr[rt];
           if (sum == m) answer++;
           while (sum >=m){
               sum -=arr[lt++];
               if (sum == m) answer++;
           }
       }

       return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Tow4_answer T = new Tow4_answer();

        System.out.println(T.solution(n, m, arr));


    }
}

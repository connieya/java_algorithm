package com.company.inflearn.sec04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Hash05_answer {
    public int solution(int []arr, int n , int k){
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); // 내림 차순

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                for (int l=j+1; l<n; l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt =0;
        for (int x : Tset){
            cnt++;
            if (cnt == k) return x;
        }

        return answer;
    }

    public static void main(String[] args) {

      Hash05_answer H = new Hash05_answer();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[n];
        for (int  i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(H.solution(arr,n,k));
    }


}

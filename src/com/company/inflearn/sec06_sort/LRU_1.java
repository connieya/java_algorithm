package com.company.inflearn.sec06_sort;

import java.util.Scanner;

public class LRU_1 {
    static int S,N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         S = sc.nextInt();
         N = sc.nextInt();
        int answer[] = new int[S];
        while (N-- >0){
            int v = sc.nextInt();
            sort(answer,v);
        }
        for (int x: answer){
            System.out.print(x+" ");
        }
    }
    static void sort(int answer[],int v){
        for (int j=0; j<S; j++){
            if (answer[j]==v){
                for (int k = j; k>0; k--){
                    answer[k] = answer[k-1];
                }
                answer[0] =v;
                return;
            }
        }
        for (int j = S-1; j>0; j--){
            answer[j] = answer[j-1];
        }
        answer[0]= v;
    }
}

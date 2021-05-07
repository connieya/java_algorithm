package com.company.inflearn.sec06;

import java.util.Scanner;

public class LRU {
    public int[] solution(int size , int n, int[] arr){
        int [] cache = new int[size];

        for (int x : arr){
            int pos = -1;
            for (int i=0; i<size; i++){
                if (x == cache[i]) pos = i; // Cache Hit
            }
            if (pos == -1) { // Cache Miss;
                for (int i = size-1; i>=1; i--){
                    cache[i] = cache[i-1];
                }

            }else { // Cache Hit
                for (int i=pos; i>=1; i--){
                    cache[i] = cache[i-1];
                }

            }
            cache[0]= x;
        }

        return cache;
    }

    public static void main(String[] args) {
        LRU L = new LRU();


        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int x : L.solution(s,n,arr)){
            System.out.print(x+" ");
        }
    }
}

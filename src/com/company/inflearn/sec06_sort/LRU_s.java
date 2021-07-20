package com.company.inflearn.sec06_sort;

import java.util.Scanner;

public class LRU_s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int cache[] = new int[s];
        while (n-- >0){
            int input = sc.nextInt();
            int idx = cacheIndex(input,cache,s);
            if (idx == -1) {
                cacheMiss(cache, s);
            } else {
                cacheHit(cache, idx);
            }

            cache[0] = input;
        }
        for (int x : cache){
            System.out.print(x+" ");
        }
    }
    static int cacheIndex(int input, int cache[], int size){
        int index =-1;
        for (int i=0; i<size; i++){
            if (cache[i]==input){
                return i;
            }
        }
        return index;
    }
    static void cacheMiss(int cache[],int size){
        for (int i=size-1; i>0; i--){
            cache[i] = cache[i-1];
        }
    }

    static void cacheHit(int cache[] , int idx){
        for (int i=idx; i>0; i--){
            cache[i] = cache[i-1];
        }
    }
}

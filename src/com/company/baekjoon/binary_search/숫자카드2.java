package com.company.baekjoon.binary_search;

import java.util.HashMap;
import java.util.Scanner;

public class 숫자카드2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<n; i++){
           map.put(sc.nextInt(),map.getOrDefault(i,0)+1);
        }
        int m = sc.nextInt();
        int arr[] = new int[m];
        for (int i=0; i<m; i++){
            int v = sc.nextInt();
            arr[i] = map.get(v);
        }

        for (int x: arr){
            System.out.print(x+" ");
        }
    }
}

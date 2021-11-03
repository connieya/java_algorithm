package com.company.study.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 중복순열구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[] = new int[m];
        dfs(0,n,arr,m);
    }

    public static void dfs(int L , int n , int arr[]  ,int m) {
        if (L==m) {
            for (int a : arr){
                System.out.print(a+" ");
            }
            System.out.println();
            return;
        }
        for (int i=1; i<=n; i++) {
            arr[L] = i;
            dfs(L+1 , n , arr ,m);
        }
    }
}

package com.company.inflearn.sec08_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바둑이승차 {
    static int N,C ,MAX , answer = 0;
    static int array[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         C = Integer.parseInt(st.nextToken());
         N = Integer.parseInt(st.nextToken());
        int total = 0;
        array= new int[N];
        for (int i=0; i<N; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        DFS(0,0,array);
        System.out.println(answer);
    }

    static void DFS(int L, int sum , int[]arr){
        if (sum >C) return;
        if (N==L) {
            answer =Math.max(answer,sum);
            return ;
        }else{
            DFS(L+1, sum+arr[L],arr);
            DFS(L+1, sum,arr);
        }
    }
}

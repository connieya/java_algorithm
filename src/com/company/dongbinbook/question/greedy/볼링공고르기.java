package com.company.dongbinbook.question.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 볼링공고르기 {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int answer [] = new int[2];
        dfs(0,arr,answer,0);
        System.out.println(count);
    }
    public static void dfs(int depth, int[]arr , int answer[] , int start){
        if (depth == answer.length){
            if (answer[0] != answer[1]){
                count++;
            }
            return;
        }
        for (int i=start; i<arr.length; i++) {
            answer[depth] = arr[i];
            dfs(depth+1 , arr, answer, i+1);
        }
    }
}

package com.company.sovled.silver3;

import java.util.Scanner;

public class N과M_15650 {
    static int n,m;
    static int []answer;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int depth , int idx){
        if(depth == m){
            for (int i=0; i<m; i++){
                sb.append(answer[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = idx; i <= n; i++) {
            answer[depth] = i;
            dfs(depth+1,i+1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        m = input.nextInt();
        answer = new int[m];
        dfs(0,1);
        System.out.println(sb.toString());
    }
}

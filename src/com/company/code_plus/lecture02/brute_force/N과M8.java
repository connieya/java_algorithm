package com.company.code_plus.lecture02.brute_force;

import java.util.Arrays;
import java.util.Scanner;

public class N과M8 {
    static int n,m;
    static int answer[];
    static int array[];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        m= sc.nextInt();
        array = new int[n];
        answer = new  int[m];
        for (int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        DFS(0,0);
        System.out.println(sb);
    }

    static void DFS(int L, int start){
        if (L==m){
            for (int c : answer){
                sb.append(c).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i=start; i<n; i++){
            answer[L] = array[i];
            DFS(L+1,i);

        }
    }
}

package com.company.baekjoon.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 숨바꼭질_1697 {
    static int N,K ,answer =0;
    static int MAX = 100001;
    static boolean check[] = new boolean[MAX];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        DFS(N);
        System.out.println(answer);

    }
    static int DFS(int N){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int i=0; i<len; i++){
                int v = queue.poll();
                if (v==K) {
                    return answer;
                }
                if (!check[v]){
                    check[v] = true;
                    if (v+1<MAX && !check[v+1]){
                        queue.offer(v+1);
                    }
                    if (v-1>=0 && !check[v-1]){
                        queue.offer(v-1);

                    }
                    if (v*2<MAX && !check[v*2]){
                        queue.offer(v*2);
                    }

                }
            }
            answer++;
        }
        return answer;
    }
}

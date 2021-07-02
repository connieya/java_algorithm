package com.company.inflearn.sec07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 그래프_최단거리_BFS {
    static int N,M;
    static boolean [] check;
    static int [] dis;
    static ArrayList<ArrayList<Integer>> graph;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
         M = sc.nextInt();
         graph = new ArrayList<ArrayList<Integer>>();
         for (int i=0; i<=N; i++){
             graph.add(new ArrayList<>());
         }
         check = new boolean[N+1];
         dis = new int[N+1];

         for (int i=0; i<M; i++){
             int a = sc.nextInt();
             int b = sc.nextInt();
             graph.get(a).add(b);
         }
         BFS(1);
         for (int i =2;i<dis.length; i++){
             System.out.println(i+" : "+dis[i]);
         }
    }
    static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        check[v] = true;
        dis[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()){
            int current_v = queue.poll();
            for (int next_v : graph.get(current_v)){
                if (!check[next_v]){
                    check[next_v] = true;
                    queue.offer(next_v);
                    dis[next_v] = dis[current_v]+1;
                }

            }
        }


    }
}

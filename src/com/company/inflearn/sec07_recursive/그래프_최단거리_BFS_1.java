package com.company.inflearn.sec07_recursive;

import java.util.ArrayList;
import java.util.Scanner;

public class 그래프_최단거리_BFS_1 {
    static ArrayList<ArrayList<Integer>> graph;
    static int N,M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
         M = sc.nextInt();
         graph = new ArrayList<ArrayList<Integer>>();
         for (int i=0; i<=N; i++){
             graph.add(new ArrayList<>());
         }
         while (M-- >0) {
             int a = sc.nextInt();
             int b = sc.nextInt();
             graph.get(a).add(b);
         }
    }
    static void BFS(int v){

    }
}

package com.company.inflearn.sec09_greedy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 원더랜드 {
    static int[] unf;
    static class Edge implements Comparable<Edge>{
        int v1 , v2, cost;
        Edge(int v1, int v2 , int cost){
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost- o.cost;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        unf = new int[V+1];
        ArrayList<Edge> wonderland = new ArrayList<>();
        for (int i=0; i<E; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            wonderland.add(new Edge(A,B,C));
        }
        int answer = 0;
        Collections.sort(wonderland);
        for (Edge ob : wonderland){
            int fv1 = Find(ob.v1);
            int fv2 = Find(ob.v2);
            if (fv1 != fv2){
                answer += ob.cost;
                Union(ob.v1,ob.v2);
            }
        }
        System.out.println(answer);

    }
    static void Union(int a, int b){
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unf[fa] =fb;
    }
    static int Find(int v){
        if (v== unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }
}

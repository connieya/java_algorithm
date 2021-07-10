package com.company.inflearn.sec08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Position_1{
    int x ,y;
    public Position_1(int x,int y){
        this.x =x;
        this.y =y;
    }
}
public class 피자배달거리 {
    static int n, m , len ,sum, answer = Integer.MAX_VALUE;
    static ArrayList<Position_1> hs , pz;
    static int combi[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        hs= new ArrayList<>();
        pz= new ArrayList<>();
        for (int i=0; i<n;i++){
            for( int j=0; j<n; j++){
                int tmp = sc.nextInt();
                if (tmp ==1) hs.add(new Position_1(i, j));
                else if (tmp == 2) pz.add(new Position_1(i,j));
            }
        }
        combi = new int[m];
        len = pz.size();
        DFS(0,0);
        System.out.println(answer);
    }
    static void DFS(int L, int s){
        if (L == m){
          int sum =0;
          for (Position_1 h : hs){
              int dis = Integer.MAX_VALUE;
              for (int i : combi){
                  dis = Math.min(dis,Math.abs(h.x -pz.get(i).x) + Math.abs(h.y-pz.get(i).y));
              }
              sum +=dis;

          }
          answer = Math.min(sum , answer);

        }else {
            for (int i=s; i<len; i++){
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
}

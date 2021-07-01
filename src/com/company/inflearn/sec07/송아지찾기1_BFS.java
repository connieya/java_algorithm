package com.company.inflearn.sec07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기1_BFS {
    static int dis[]  = {1,-1,5};
    static boolean check [] = new boolean[10001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        System.out.println(BFS(S,E));
    }
    public static int BFS(int s, int e){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        check[s] = true;
        int L = 0;
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int i=0; i<len; i++){
                int x = queue.poll();
                for (int j=0; j<3; j++){
                    int nx = x+dis[j];
                    if (nx==e) return L+1;
                    if (nx>=1 && !check[nx]){
                        check[nx] = true;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }

        return L;
    }
}

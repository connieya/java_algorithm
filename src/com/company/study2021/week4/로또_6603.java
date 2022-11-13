package com.company.study2021.week4;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 로또_6603 {
    static int n;
    static int arr[];
    static boolean check[];
    static  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        queue.isEmpty();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            if (n == 0) {
                break;
            }
            arr = new int[n];
            check = new boolean[n];
            int i = 0;
            while (st.hasMoreElements()) {
                arr[i++] = Integer.parseInt(st.nextToken());
            }
            dfs(0,0);
            bw.write("\n");
            bw.flush();

        }
    }

    public static void dfs(int L, int start) throws IOException {
        if (L == 6) {
            for (int i=0; i<n; i++) {
                if (check[i]){
                    bw.write(arr[i]+" ");
                }
            }
            bw.write("\n");
            bw.flush();
        } else {
            for (int i = start; i <n; i++) {
                check[i] = true;
                dfs(L+1 , i+1);
                check[i] =false;
            }
        }

    }
}

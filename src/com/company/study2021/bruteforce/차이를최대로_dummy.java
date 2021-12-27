package com.company.study2021.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 차이를최대로_dummy {
    static int N;
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        boolean visited[] = new boolean[N];
        int newArr[] = new int[N];
        dfs(visited, 0, newArr, arr);
        System.out.println(answer);

    }

    public static void dfs(boolean[] visited, int L, int[] newArr, int[] arr) {
        if (L == N) {
            for (int a : newArr) {
                System.out.print(a+"  ");
            }
            System.out.println();

            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                newArr[L] = arr[i];
                dfs(visited, L + 1, newArr, arr);
                visited[i] = false;
            }
        }


    }
}

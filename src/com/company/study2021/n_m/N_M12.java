package com.company.study2021.n_m;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N_M12 {
    static int N, M;
    static int arr[], answer[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        answer = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0, 0);
        System.out.println(sb);
    }

    public static void dfs(int L, int start) {
        if (L == M) {
            for (int a : answer) {
                sb.append(a + " ");
            }
            sb.append("\n");
            return;
        }
        int check = -1;
        for (int i = start; i < arr.length; i++) {
            if (check == arr[i]) {
                continue;
            }
            check = arr[i];
            answer[L] = arr[i];
            dfs(L + 1, i);
        }
    }
}

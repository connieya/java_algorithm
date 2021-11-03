package com.company.study.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 합이같은부분집합 {
    static int N;
    static String answer = "NO";
    static boolean flag = false; // 재귀를 그만 호출하기 위한 장치

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        dfs(sum, 0, 0, arr);
        System.out.println(answer);

    }

    public static void dfs(int sum, int dsum, int L, int arr[]) {
        if (flag){ // 조건을 만족하니 모든 재귀는 pop
            return;
        }
        if (L == N) {
            if (dsum == sum - dsum){
                flag = true; // 조건을 만족할 때 표시
                answer = "YES";
                return ;
            }
            return;

        }
        dfs(sum, dsum, L + 1, arr);
        dfs(sum, dsum + arr[L], L + 1, arr);

    }
}

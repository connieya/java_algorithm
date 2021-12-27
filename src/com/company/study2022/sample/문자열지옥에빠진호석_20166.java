package com.company.study2022.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 문자열지옥에빠진호석_20166 {
    static int N, M;
    static char tile[][];
    static int dx[] = {-1, 0, 1, 0, -1, -1, 1, 1};
    static int dy[] = {0, 1, 0, -1, -1, 1, 1, -1};
    static Map<String, Integer> map;
    static String str;
    static int len;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String strArray[] = new String[K];
        tile = new char[N][M];
        map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                tile[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < K; i++) {
            str = br.readLine();
            len = Math.max(len, str.length());
            map.put(str, 0);
            strArray[i] = str;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                dfs(i, j, 0, tile[i][j] + "");
            }
        }
        for (String str : strArray) {
            System.out.println(map.get(str));
        }
    }

    public static void dfs(int x, int y, int L, String s) {
        if (map.containsKey(s)) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        if (L == len) {
            return;
        }
        for (int i = 0; i < 8; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if (nx < 0) {
                nx += N;
            }
            if (nx >= N) {
                nx = 0;
            }
            if (ny < 0) {
                ny += M;
            }
            if (ny >= M) {
                ny = 0;
            }
            dfs(nx, ny, L + 1, s + tile[nx][ny]);
        }
    }
}

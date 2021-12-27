package com.company.study2021.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스타트와링크_14889 {
    static int N;
    static int map[][];
    static boolean visit[];
    static int MIN = Integer.MAX_VALUE;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visit = new boolean[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int j = 0;
            while (st.hasMoreElements()) {
                map[i][j++] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0, 0);
        System.out.println(MIN);

    }

    public static void dfs(int L, int start) {
        if (L == N / 2) { // 팀 절반으로 나눔
            // 절반 중 한 쪽은 visit가 true , 또 다른 한쪽은 visit가 false
            calcMinValue();
            return;
        }
        for (int i = start; i < N; i++) {
            if (visit[i]) {
                continue;
            }
            visit[i] = true;
            dfs(L + 1, i + 1); // 조합
            visit[i] = false;
        }
    }

    private static void calcMinValue() {
        if (count == N / 2) {
            return;
        }
        int startTeam = 0;
        int linkTeam = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visit[i] && visit[j]) {
                    startTeam += map[i][j];
                    startTeam += map[j][i];
                } else if (visit[i] == false && visit[j] == false) {
                    linkTeam += map[i][j];
                    linkTeam += map[j][i];
                }
            }
        }
        int abs = Math.abs(startTeam - linkTeam);
        MIN = Math.min(abs, MIN);

    }
}

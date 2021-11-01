package com.company.study.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SmallWorldNetwork_18243 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int N, K;
    static boolean checked[];
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        checked = new boolean[N+1];
        String answer = "Small World!";
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i=0; i<K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i=1; i<=N; i++){
            checked[i] = true;
            if (!dfs(i)){
                answer = "Big World!";
                break;
            }
            count = 0;
            checked[i] = false;
        }
        System.out.println(answer);
    }
    public static boolean dfs(int L) {
        if (count >= 7) {
            return false;
        }

        for (int element : graph.get(L)) {
            if (!checked[element]) {
                checked[element] = true;
                count++;
                dfs(element);
                checked[element] = false;
            }
        }
        return true;
    }
}

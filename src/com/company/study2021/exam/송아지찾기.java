package com.company.study2021.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 송아지찾기 {
    static int S, E, L;
    static int check[] = new int[10001];
    static int dir[] = {1, -1, 5};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        BFS();
        System.out.println(L + 1);
    }

    public static int BFS() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(S);
        check[S] = 1;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int x = queue.poll();
                for (int j = 0; j < dir.length; j++) {
                    int nx = x + dir[j];
                    if (nx == E) {
                        return L + 1;
                    }
                    if (nx >= 1 && nx<=10000 && check[nx] == 0) {
                        check[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }

        return L;
    }
}

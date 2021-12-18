package com.company.sovled.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 스타트링크_5014 {
    static int floor[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int F = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        floor = new int[F + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(S);
        floor[S] = 1;
        loop:
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            int dx[] = {U, -1 * D};
            for (int i = 0; i < 2; i++) {
                int nx = cur + dx[i];
                if (nx >= 1 && nx <= F && floor[nx] == 0) {
                    floor[nx] = floor[cur] + 1;
                    queue.add(nx);
                    if (nx == G) {
                        break loop;
                    }
                }
            }
        }
        if (floor[G] == 0) {
            System.out.println("use the stairs");
        } else {
            System.out.println(floor[G]-1);
        }
    }
}

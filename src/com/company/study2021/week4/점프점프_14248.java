package com.company.study2021.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 점프점프_14248 {
    static int n;
    static int check[], stoneBridge[];
    static int dir[] = {1, -1}; // 왼쪽 , 오른쪽 점프
    static int count = 1; // 시작 지점도 방문한 것이니 1으로 초기화

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        stoneBridge = new int[n]; // 돌다리
        check = new int[n]; // 방문 한곳
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            stoneBridge[i] = Integer.parseInt(st.nextToken());
        }

        int s = Integer.parseInt(br.readLine()); // 시작지점 3
        System.out.println(bfs(s-1)); // 배열 인덱스는 2

    }

    public static int bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        check[node] = 1; // 방문한 곳 체크
        while (!queue.isEmpty()) {
            node = queue.poll();
            int jump = stoneBridge[node];
            for (int d : dir) {
                int direction = (d * jump) + node;
                if (direction >= 0 && direction < n && check[direction] == 0) {
                    check[direction] = 1;
                    queue.offer(direction);
                    count++;
                }
            }
        }
        return count;
    }
}
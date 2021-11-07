package com.company.study.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Point {
    int element;
    int count;

    public Point(int element, int count) {
        this.element = element;
        this.count = count;
    }
}

public class SmallWorldNetwork_18243 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int N, K;
    static boolean checked[];
    static String answer = "Small World!";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for (int i = 1; i <= N; i++) {
            checked = new boolean[N + 1];
            checked[i] = true;
            bfs(i, 0);
            if (isBigWorld()) {
                answer = "Big World!";
                break;
            }
        }

        System.out.println(answer);
    }

    public static boolean isBigWorld() {
        for (int i = 1; i < checked.length; i++) {
            if (!checked[i]) {
                return true;
            }
        }
        return false;
    }

    public static void bfs(int index, int count) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(index, count));
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Point current = queue.poll();
                if (current.count > 6) {
                    answer = "Big World!";
                    break;
                }
                for (int element : graph.get(current.element)) {
                    if (!checked[element]) {
                        checked[element] = true;
                        queue.offer(new Point(element, current.count + 1));
                    }
                }
            }
        }


    }
}


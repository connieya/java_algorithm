package com.company.dongbinbook.question.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class Virus implements Comparable<Virus> {
    int x;
    int y;
    int num;

    public Virus(int x, int y, int num) {
        this.x = x;
        this.y = y;
        this.num = num;
    }

    @Override
    public int compareTo(Virus o) {
        return this.num - o.num;
    }
}

public class 경쟁적전염_18405 {
    static int map[][];
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        int second = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken()) - 1;
        int y = Integer.parseInt(st.nextToken()) - 1;

        PriorityQueue<Virus> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] != 0) {
                    pq.add(new Virus(i, j, map[i][j]));
                }
            }
        }
        Queue<Virus> queue = new LinkedList<>();
        while (!pq.isEmpty()) {
            queue.add(pq.poll());
        }
        int count = 0;
        while (!queue.isEmpty()) {
            if (count == second) {
                break;
            }
            count++;
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Virus current = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = current.x + dx[j];
                    int ny = current.y + dy[j];
                    if (nx >= 0 && nx < N && ny >= 0 && ny < N && map[nx][ny] == 0) {
                        map[nx][ny] = current.num;
                        queue.offer(new Virus(nx, ny, current.num));
                    }
                }
            }
        }
        System.out.println(map[x][y]);
    }
}

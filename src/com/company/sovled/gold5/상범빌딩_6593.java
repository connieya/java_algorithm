package com.company.sovled.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pos {
    int l, r, c;

    public Pos(int l, int r, int c) {
        this.l = l;
        this.r = r;
        this.c = c;
    }
}

public class 상범빌딩_6593 {
    static char building[][][];
    static int answer[][][];
    static int dr[] = {-1, 0, 1, 0, 0, 0};
    static int dc[] = {0, 1, 0, -1, 0, 0};
    static int dl[] = {0, 0, 0, 0, 1, -1};
    static int L, R, C;
    static boolean isEscaped;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Queue<Pos> queue = new LinkedList<>();
            L = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            if (L == 0 && R == 0 && C == 0) {
                break;
            }
            isEscaped = false;
            building = new char[L][R][C];
            answer = new int[L][R][C];
            for (int i = 0; i < L; i++) {
                for (int j = 0; j < R; j++) {
                    String str = br.readLine();
                    for (int k = 0; k < C; k++) {
                        building[i][j][k] = str.charAt(k);
                        answer[i][j][k] = -1;
                        if (building[i][j][k] == 'S') {
                            queue.offer(new Pos(i, j, k));
                            answer[i][j][k] = 0;
                        }
                    }
                }
                br.readLine();
            }
            bfs(queue);
            if (!isEscaped) {
                System.out.println("Trapped!");
            }
        }
    }

    public static void bfs(Queue<Pos> queue) {
        loop:
        while (!queue.isEmpty()) {
            Pos cur = queue.poll();
            for (int i = 0; i < 6; i++) {
                int NL = dl[i] + cur.l;
                int NR = dr[i] + cur.r;
                int NC = dc[i] + cur.c;
                if (NL < 0 || NL >= L || NR < 0 || NR >= R || NC < 0 || NC >= C) continue;
                if (building[NL][NR][NC] == '#' || answer[NL][NR][NC] > 0) continue;
                if (building[NL][NR][NC] == 'E') {
                    System.out.println(String.format("Escaped in %d minute(s).", answer[cur.l][cur.r][cur.c] + 1));
                    isEscaped = true;
                    break loop;
                }
                answer[NL][NR][NC] = answer[cur.l][cur.r][cur.c] + 1;
                queue.offer(new Pos(NL, NR, NC));
            }
        }
    }
}

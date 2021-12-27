package com.company.sovled.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Dir {
    int x,y;

    public Dir(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 영역구하기_2583 {
    static int M, N;
    static int map[][];
    static int dx [] = {-1,0,1,0};
    static int dy [] = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        int ans =0;
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        map = new int[M][N];
        while (k-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            for (int i = M - d; i < M - b; i++) {
                for (int j = a; j < c; j++) {
                    map[i][j] = 1;
                }
            }

        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[j][i] ==0){
                    map[j][i] = 1;
                    ans++;
                    list.add(dfs(j,i));
                }
            }
        }
        System.out.println(ans);
        Collections.sort(list);
        for (int x : list){
            System.out.print(x+" ");
        }
    }

    public static int dfs(int x, int y) {
       int cnt = 1;
        Queue<Dir> queue = new LinkedList<>();
        queue.offer(new Dir(x,y));
        while (!queue.isEmpty()){
            Dir cur = queue.poll();
            for (int i=0; i<4; i++){
                int nx = dx[i] + cur.x;
                int ny = dy[i] + cur.y;
                if (nx >=0 && nx <M  && ny>=0 && ny < N && map[nx][ny] == 0){
                    map[nx][ny] =1;
                    cnt++;
                    queue.offer(new Dir(nx,ny));
                }
            }
        }
        return cnt;
    }
}

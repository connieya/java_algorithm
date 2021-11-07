package com.company.programmers.level2;

import java.util.Arrays;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


public class 거리두기확인하기_dfs {
    static int answer[];
    static char room[][];
    static boolean visited [][];
    static int dx [] = {-1,0,1,0};
    static int dy [] = {0,1,0,-1};
    static int st= 0;

    public static void main(String[] args) {
        String[][] places = {
                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"},
        };
        int len = places.length;
        answer = new int[len];
        for (int i=0; i< len; i++) {
            answer[i] = 1;
            room = new char[5][5];
            visited = new boolean[5][5];
            for (int j=0; j<5; j++) {
                for (int k=0; k<5; k++){
                    room[j][k] = places[i][j].charAt(k);
                }
            }
            st =0;

            loop:for (int x=0; x<5; x++){
                for (int y=0; y<5; y++) {
                    if (room[x][y] == 'P') {
                        visited[x][y] = true;
                        int dfs = dfs(x, y, 0);
                        if (dfs == 1){
                            answer[i] = 0;
                            break loop;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(answer));

    }
    public static int dfs(int x , int y  , int count) {
        if (count > 2) {
            return st;
        }

        if (count >0  && count<=2 && room[x][y] =='P') {
            return  ++st;
        }

        for (int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >=0 && nx < 5 && ny >=0 && ny < 5  && !visited[nx][ny] && room[nx][ny] !='X') {
                visited[nx][ny] = true;
                dfs(nx , ny ,count+1);
                visited[nx][ny] = false;
            }
        }
        return st;
    }
}

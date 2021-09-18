package com.company.dongbinbook.dfs_bfs;

public class 음료수얼려먹기 {
    static int ice[][];
    static int count;
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) {
        ice = new int[][]{
                {0, 0, 1, 1, 0},
                {0, 0, 0, 1, 1},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}
        };

        for (int i = 0; i < ice.length; i++) {
            for (int j = 0; j < ice[i].length; j++) {
                if (ice[i][j] == 0) {
                    count++;
                    dfs(i, j);
                }
            }
        }
        System.out.println(count);
    }

    static void dfs(int x, int y) {
        if (x < 0 || y < 0 || x > 3 || y > 4) {
            return;
        }
        if (ice[x][y] == 0 ) {
            ice[x][y] =1;
            dfs(x-1,y);
            dfs(x+1, y);
            dfs(x,y-1);
            dfs(x,y+1);
           return;
        }


    }
}

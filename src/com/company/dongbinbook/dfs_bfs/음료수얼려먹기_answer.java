package com.company.dongbinbook.dfs_bfs;

public class 음료수얼려먹기_answer {
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
                if (dfs(i,j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean dfs(int x, int y) {
        if (x <= -1 || x >= 4 || y <= -1 || y >= 5) {
            return false;
        }
        if (ice[x][y] == 0) {
            ice[x][y] = 1;

            dfs(x-1,y);
            dfs(x+1, y);
            dfs(x,y-1);
            dfs(x,y+1);
            return true;
        }
        return false;
    }
}

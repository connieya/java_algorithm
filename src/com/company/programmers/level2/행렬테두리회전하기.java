package com.company.programmers.level2;

import java.util.Arrays;

public class 행렬테두리회전하기 {
    static int dx [] = {0,-1,0,1};
    static int dy [] = {1,0,-1,0};
    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;
        int queries[][] = {{2, 2, 5, 4} ,{3,3,6,6} , {5,1,6,3}};
        int[] answer = new int[queries.length];
        int[][] arr = new int[rows][columns];
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = value++;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int x1 = queries[i][0] - 1;
            int y1 = queries[i][1] - 1;
            int x2 = queries[i][2] - 1;
            int y2 = queries[i][3] - 1;
            answer[i] = rotate(x1,y1,x2,y2,arr);
        }

        System.out.println(Arrays.toString(answer));
    }

    public static int rotate(int x1, int y1, int x2, int y2, int arr[][]) {
        int dir = 0;
        int i= x2;
        int j =y1;
        int value = arr[x2][y1];
        int min = value;
        while (dir < 4) {
            int nx = x2 + dx[dir];
            int ny = y1 + dy[dir];
            if (nx>=x1 && nx <=i && ny >=j && ny <= y2) {
                min = Math.min(min,arr[nx][ny]);
               arr[x2][y1] = arr[nx][ny];
               x2 = nx;
               y1 = ny;
            }else {
                dir++;
            }
        }
        arr[x2-1][y1] = value;
        return min;
    }

}

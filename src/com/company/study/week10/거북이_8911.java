package com.company.study.week10;

import java.io.*;

public class 거북이_8911 {
    static int dx[] = {1, 0, -1, 0}; // 동 남 서 북
    static int dy[] = {0, -1, 0, 1}; // 0 1 2 3
    static int direction = 3;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            String str = br.readLine();
            int xMax = 0;
            int xMin = 0;
            int yMax = 0;
            int yMin = 0;
            int x = 0;
            int y = 0;
            for (char ch : str.toCharArray()) {
                if (ch == 'F') {
                    x = x + dx[direction];
                    y = y + dy[direction];
                }
                if (ch == 'B') {
                    x = x - dx[direction];
                    y = y - dy[direction];
                }
                if (ch == 'L') {
                    direction = (direction+3) % 4;
                    continue;
                }
                if (ch == 'R') {
                   direction = (direction+1) % 4;
                    continue;
                }
                xMax = Math.max(xMax, x);
                xMin = Math.min(xMin, x);
                yMax = Math.max(yMax, y);
                yMin = Math.min(yMin, y);
            }
            int width = xMax - xMin;
            int height = yMax - yMin;
            sb.append(width*height).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

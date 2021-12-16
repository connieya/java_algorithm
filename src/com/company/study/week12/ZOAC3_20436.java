package com.company.study.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Direction {
    int x, y;

    public Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ZOAC3_20436 {
    static char keyboard[][] = {
            {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'},
            {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'},
            {'z', 'x', 'c', 'v', 'b', 'n', 'm'}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char s1 = st.nextToken().charAt(0);
        char s2 = st.nextToken().charAt(0);
        Direction left = getDirection(s1);
        Direction right = getDirection(s2);
        int ans = 0;
        String str = br.readLine();
        for (char c : str.toCharArray()) {
            Direction cur = getDirection(c);
            if ((cur.x <= 1 && cur.y <= 4) || (cur.x <= 2 && cur.y <= 3)) {// 자음
                ans += Math.abs(left.x - cur.x) + Math.abs(left.y - cur.y);
                left.x = cur.x;
                left.y = cur.y;
            } else {
                ans += Math.abs(right.x - cur.x) + Math.abs(right.y - cur.y); // 모음
                right.x = cur.x;
                right.y = cur.y;
            }
        }
        System.out.println(ans + str.length());

    }

    public static Direction getDirection(char c) {
        int i = 0;
        int j = 0;
        loop:
        for (i = 0; i < keyboard.length; i++) {
            for (j = 0; j < keyboard[i].length; j++) {
                if (c == keyboard[i][j]) {
                    break loop;
                }
            }
        }
        return new Direction(i, j);
    }
}

package com.company.study2021.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 쿠키의신체측정_20125 {
    static int x, y, n;
    static char cookie[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        cookie = new char[n + 1][n + 1];
        boolean isHead = false;
        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            for (int j = 1; j <= n; j++) {
                cookie[i][j] = str.charAt(j - 1);
                if (!isHead && cookie[i][j] == '*') {
                    isHead = true;
                    x = i + 1;
                    y = j;
                }
            }
        }
        System.out.println(x + " " + y);
        int leftArm = y - getLeftArm(x, y) - 1;
        int rightArm = getRightAm(x, y) - y - 1;
        int waist = getWaist(x, y) - x - 1;
        int penis = getWaist(x, y);
        int leftLeg = getLeftLeg(penis, y - 1) - penis;
        int rightLeg = getRightLeg(penis, y + 1) - penis;
        System.out.println(leftArm + " " + rightArm + " " + waist + " " + leftLeg + " " + rightLeg);

    }

    public static int getLeftArm(int x, int y) {
        if (y <= 0 || cookie[x][y] == '_') {
            return y;
        }
        return getLeftArm(x, y - 1);
    }

    public static int getRightAm(int x, int y) {
        if (y >= n + 1 || cookie[x][y] == '_') {
            return y;
        }
        return getRightAm(x, y + 1);
    }

    public static int getWaist(int x, int y) {
        if (x >= n+1 || cookie[x][y] == '_') {
            return x;
        }
        return getWaist(x + 1, y);
    }

    public static int getLeftLeg(int x, int y) {
        if (x >= n + 1 || cookie[x][y] == '_') {
            return x;
        }
        return getLeftLeg(x + 1, y);
    }

    public static int getRightLeg(int x, int y) {
        if (x >= n + 1 || cookie[x][y] == '_') {
            return x;
        }
        return getRightLeg(x + 1, y);
    }
}

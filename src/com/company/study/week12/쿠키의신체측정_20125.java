package com.company.study.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 쿠키의신체측정_20125 {
    static int x, y;
    static char cookie[][];
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        cookie = new char[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                cookie[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cookie[i][j] == '*') {
                    x = i+2;
                    y = j+1;
                    break;
                }
            }
        }
        System.out.println(x+" "+y);
//        System.out.println(getLeftArm(x,y-1));
    }

    public static int getLeftArm(int x, int y) {
        if (y < 1){
            return count;
        }
        if (cookie[x][y] == '*'){
            count++;
            getLeftArm(x,y-1);
        }else{
            return count;
        }

        return count;
    }
}

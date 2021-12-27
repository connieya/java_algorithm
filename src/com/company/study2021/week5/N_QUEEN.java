package com.company.study2021.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_QUEEN {
    static int count = 0;
    static int n;
    static int arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dfs(0);
        System.out.println(count);
    }

    public static void dfs(int depth) { // 행
        if (depth == n) {
            count++;
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[depth] = i;
            if (isValid(depth)) {
                dfs(depth + 1);
            }
        }
    }

    private static boolean isValid(int row) {
        for (int i=0; i<row; i++) {
            if (arr[row] == arr[i]) {
                return false;
            } else if (Math.abs(row - i) == Math.abs(arr[row]-arr[i]))  {
                return false;
            }
        }

        return true;

    }
}

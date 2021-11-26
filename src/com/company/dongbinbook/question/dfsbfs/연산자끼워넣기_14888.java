package com.company.dongbinbook.question.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연산자끼워넣기_14888 {
    static int operation[] = new int[4];
    static int arr[];
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operation[i] = Integer.parseInt(st.nextToken());
        }
        dfs(arr[0], 1);
        System.out.println(MAX);
        System.out.println(MIN);
    }

    public static void dfs(int value, int index) {
        if (index == arr.length) {
            MAX = Math.max(MAX, value);
            MIN = Math.min(MIN, value);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (operation[i] > 0) {
                operation[i]--;
                switch (i) {
                    case 0:
                        dfs(value + arr[index], index + 1);
                        break;
                    case 1:
                        dfs(value - arr[index], index + 1);
                        break;
                    case 2:
                        dfs(value * arr[index], index + 1);
                        break;
                    case 3:
                        dfs(value / arr[i], index + 1);
                        break;
                }
                operation[i]++;
            }
        }
    }
}

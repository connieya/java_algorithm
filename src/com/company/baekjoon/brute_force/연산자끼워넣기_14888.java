package com.company.baekjoon.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연산자끼워넣기_14888 {
    static int N;
    static int numbers[];
    static int operation[];
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        numbers = new int[N];
        operation = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operation[i] = Integer.parseInt(st.nextToken());
        }
        dfs(numbers[0], 1);
        System.out.println(MAX);
        System.out.println(MIN);
    }


    public static void dfs(int num, int index) {
        if (index == N) {
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (operation[i] > 0) {
                operation[i]--;
                switch (i) {
                    case 0:
                        dfs(num + numbers[index], index + 1);
                        break;
                    case 1:
                        dfs(num - numbers[index], index + 1);
                        break;
                    case 2:
                        dfs(num * numbers[index], index + 1);
                        break;
                    case 3:
                        dfs(num / numbers[index], index + 1);

                }
                operation[i]++;
            }
        }

    }
}

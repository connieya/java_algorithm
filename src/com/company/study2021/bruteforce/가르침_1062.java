package com.company.study2021.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가르침_1062 {
    static int standard = 5;
    static boolean alpha[] = new boolean[26];
    static String words[];
    static int MAX = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        words = new String[n];
        if (k < standard) {
            System.out.println(0);
        } else {
            alpha['a' - 'a'] = true;
            alpha['c' - 'a'] = true;
            alpha['n' - 'a'] = true;
            alpha['t' - 'a'] = true;
            alpha['i' - 'a'] = true;
            for (int i = 0; i < n; i++) {
                words[i] = br.readLine();
            }
            dfs(0, k - 5, 0);
            System.out.println(MAX);
        }

    }

    public static void dfs(int depth, int k, int start) {
        if (depth == k) {
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                boolean flag = true;
                loop:
                for (int j = 0; j < words[i].length(); j++) {
                    char value = words[i].charAt(j);
                    if (!alpha[value - 'a']) {
                        flag = false;
                        break loop;
                    }
                }
                if (flag) {
                    count++;
                }
            }
            MAX = Math.max(MAX, count);
            return;
        }

        for (int i = start; i < 26; i++) {
            if (!alpha[i]) {
                alpha[i] = true;
                dfs(depth + 1, k, i + 1);
                alpha[i] = false;
            }
        }
    }
}

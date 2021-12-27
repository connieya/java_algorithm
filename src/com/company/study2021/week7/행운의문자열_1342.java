package com.company.study2021.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 행운의문자열_1342 {
    static char[] answer;
    static boolean[] visited;
    static char[] array;
    static int count;
    static int alpha[] = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        answer = new char[s.length()];
        array = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            answer[i] = s.charAt(i);
            alpha[s.charAt(i) - 'a']++;
        }
        visited = new boolean[answer.length];
        dfs(0, s.length());
        for (int a : alpha) {
            if (a > 1) {
                count /= factorial(a);
            }
        }
        System.out.println(count);
    }

    private static int factorial(int a) {
        if (a == 1) return 1;
        return a * factorial(a - 1);
    }

    static void dfs(int depth, int len) {
        if (depth == len) {
            if (check()) {
                count++;
            }
            return;
        }
        for (int i = 0; i < answer.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                array[depth] = answer[i];
                dfs(depth + 1, len);
                visited[i] = false;
            }
        }
    }

    public static boolean check() {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

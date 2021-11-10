package com.company.study.week7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 애너그램_6443 {
    static char array[], answer[];
    static boolean visited[];
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        String str = "abca";
        array = new char[str.length()];
        answer = new char[str.length()];
        visited = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i);
        }
        Arrays.sort(array);
        dfs(0, str.length());
        for (String st : set) {
            System.out.println(st);
        }

    }

    public static void dfs(int depth, int len) {
        if (depth == len) {
            StringBuilder sb = new StringBuilder();
            for (char ch : answer) {
                sb.append(ch);
            }
            set.add(sb.toString());
            return;
        }
        for (int i = 0; i < len; i++) {
            if (!visited[i]) {
                visited[i] = true;
                answer[depth] = array[i];
                dfs(depth + 1, len);
                visited[i] = false;

            }
        }

    }
}

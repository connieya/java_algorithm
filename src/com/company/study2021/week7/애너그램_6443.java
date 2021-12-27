package com.company.study2021.week7;

import java.io.*;
import java.util.*;

public class 애너그램_6443 {
    static char array[], answer[], mx[];
    static boolean visited[];
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String str = br.readLine();
            array = new char[str.length()];
            answer = new char[str.length()];
            visited = new boolean[str.length()];
            for (int i = 0; i < str.length(); i++) {
                array[i] = str.charAt(i);
            }
            Arrays.sort(array);
            dfs(0, str.length());

        }
        br.close();
        bw.close();
    }

    public static void dfs(int depth, int len) throws IOException {
        if (depth == len) {
            StringBuilder sb = new StringBuilder();
            for (char ch : answer) {
                sb.append(ch);
            }
            bw.write(sb.toString());
            bw.write("\n");
            bw.flush();
            return;
        }
        char before = ' ';
        for (int i = 0; i < len; i++) {
            if (!visited[i] && before != array[i]) {
                visited[i] = true;
                answer[depth] = array[i];
                before = array[i];
                dfs(depth + 1, len);
                visited[i] = false;

            }
        }

    }
}

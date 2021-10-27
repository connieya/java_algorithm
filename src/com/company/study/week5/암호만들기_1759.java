package com.company.study.week5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 암호만들기_1759 {
    static int L, C;
    static String answer[];
    static String alpha[];
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        answer = new String[L];
        alpha = new String[C];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            alpha[i] = st.nextToken();
        }
        Arrays.sort(alpha);
        dfs(0, 0);

    }

    public static void dfs(int depth, int start) throws IOException {
        if (depth == L) {
            if (check()) {
                for (String s : answer) {
                    bw.write(s);
                }
                bw.write("\n");
                bw.flush();
            }
            return;
        }
        for (int i = start; i < C; i++) {
            answer[depth] = alpha[i];
            dfs(depth + 1, i + 1);
        }
    }

    public static boolean check() {
        int m = 0;
        int n = 0;
        for (int i=0; i<L; i++) {
            if (answer[i].equals("a") || answer[i].equals("e") || answer[i].equals("i") || answer[i].equals("o") || answer[i].equals("u"))  {
                m++;
            }else {
                n++;
            }
        }
      return (m>=1 &&  n>=2) ? true : false;
    }
}

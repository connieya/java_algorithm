package com.company.sovled.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 귀걸이_1380 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int s = 1;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            String names[] = new String[n];
            int list[] = new int[n];
            for (int i = 0; i < n; i++) {
                names[i] = br.readLine();
            }
            for (int i = 0; i < 2 * n - 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());
                String a = st.nextToken();
                list[num - 1]++;
            }
            for (int i = 0; i < n; i++) {
                if (list[i] == 1) {
                    out.append(s++).append(" " + names[i]).append("\n");
                    break;
                }
            }
        }
        System.out.println(out);
    }
}

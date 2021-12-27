package com.company.study2021.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 햄버거분배_19941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String table = br.readLine();
        int count = 0;
        char[] tables = table.toCharArray();
        for (int i = 0; i < tables.length; i++) {
            if (tables[i] == 'P') {
                for (int j = i-K; j<= i+K; j++) {
                    if (j < 0 || j >= table.length()) {
                        continue;
                    }
                    if (tables[j] == 'H') {
                        tables[j] = 'N';
                        count++;
                        break;
                    }

                }
            }
        }
        System.out.println(count);

    }
}

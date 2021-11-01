package com.company.study.week6;

import java.io.*;
import java.util.StringTokenizer;

public class 상근이의여행_9372 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            boolean country[] = new boolean[N + 1];
            int count = 0;
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                if (!checkVisited(country)){
                    country[a] = true;
                    country[b] = true;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static boolean checkVisited(boolean [] country) {
        for (int i=1; i< country.length; i++) {
            if (!country[i]){
                return false;
            }
        }
        return true;
    }
}

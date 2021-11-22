package com.company.study.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class IUPC는잘개최_12788 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int pencil = m * k;
        int members[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            members[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(members);
        int answer = 0;
        for (int i = members.length - 1; i >= 0; i--) {
            pencil -= members[i];
            answer++;
            if (pencil <= 0) {
                break;
            }
        }
        if (pencil > 0) {
            System.out.println("STRESS");
        } else {
            System.out.println(answer);
        }
    }
}

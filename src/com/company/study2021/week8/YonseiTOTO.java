package com.company.study2021.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class YonseiTOTO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int subject [] = new int[n];
        for (int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int temp[] = new int[p];
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<p; j++) {
                temp[j] = Integer.parseInt(st.nextToken());
            }
            if (p < l) {
                subject[i] = 1;
                continue;
            }
            Arrays.sort(temp);
            subject[i] = temp[p-l];
        }
        int answer =0;
        Arrays.sort(subject);
        for (int i=0; i<n; i++){
            m -= subject[i];
            if (m < 0) {
                break;
            }
            answer++;
        }
        System.out.println(answer);

    }
}

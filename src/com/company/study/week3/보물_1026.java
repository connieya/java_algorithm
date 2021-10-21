package com.company.study.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 보물_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a[] = new int[N];
        int b[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int j=0; j<N; j++) {
            b[j] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int sum = 0;
        for (int k=0; k<N; k++) {
            sum += a[k]*b[N-k-1];
        }
        System.out.println(sum);
    }
}

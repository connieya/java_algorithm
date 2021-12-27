package com.company.study2021.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대부분증가수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int dy[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dy[0] =1 ;
        int answer = 0;
        for (int i=1; i<N; i++) {
            int max = 1;
            for (int j=0; j<i; j++) {
                if (arr[i] > arr[j]) {
                    int value = dy[j]+1;
                    max = Math.max(value,max);
                }
            }
            dy[i] = max;
            answer = Math.max(dy[i] , answer);
        }
        System.out.println(answer);
    }

}

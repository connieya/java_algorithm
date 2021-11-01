package com.company.study.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주식_11501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arr[] = new int[N];
            for (int i=0; i<N; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            long max =0;
            long sum =0;
            for (int j=N-1; j>=0; j--) {
                if (arr[j] > max) {
                    max = arr[j];
                }else {
                    sum += (max-arr[j]);
                }
            }
            System.out.println(sum);
        }
    }
}

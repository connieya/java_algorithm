package com.company.inflearn.sec03_two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대매출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum =0;
        for (int i=0; i<k; i++){
            sum += arr[i];
        }
        int start = 0;
        int end = k;
        int max = 0;
        while (true) {
            max = Math.max(max, sum);
            if (end == n){
                break;
            }
            sum += arr[end++];
            sum -= arr[start++];

        }
        System.out.println(max);
    }
}

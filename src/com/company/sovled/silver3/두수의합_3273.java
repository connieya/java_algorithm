package com.company.sovled.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 두수의합_3273 {
    static int num[] = new int[1000_001];
    static int answer =0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            if (arr[i] >= x) {
                continue;
            }
            if (x - arr[i] > 1000000) {
                continue;
            }
            if (num[x-arr[i]] == 1){
                answer++;
            }
            num[arr[i]] = 1;
        }
        System.out.println(answer);
    }
}

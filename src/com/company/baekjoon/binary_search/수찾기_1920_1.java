package com.company.baekjoon.binary_search;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기_1920_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int value = Integer.parseInt(st.nextToken());
            int start = 0;
            int end = arr.length - 1;
            int answer = 0;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == value) {
                    answer = 1;
                    break;
                }
                if (arr[mid] > value) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            sb.append(answer).append("\n");

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

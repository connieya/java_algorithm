package com.company.baekjoon.binary_search;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기_1920 {
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
            int result = binary_search(arr,0,arr.length-1,value);
            sb.append(result).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static int binary_search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return 0;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            return 1;
        } else if (arr[mid] > target){
            return binary_search(arr,start,mid-1,target);
        }
        return binary_search(arr, mid+1,end,target);
    }
}

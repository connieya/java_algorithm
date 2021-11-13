package com.company.inflearn.sec06_sort_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 뮤직비디오 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine());
        int rt = 0;
        int lt = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            rt += arr[i];
            lt = Math.max(lt, arr[i]);
        }
        int mid = 0;
        int answer =0;
        while (lt <= rt) {
            mid = (lt + rt) / 2;
            int sum = 0;
            int count = 1;
            for (int x: arr) {
                if (sum+x > mid){
                    sum = x;
                    count++;
                }else {
                    sum +=x;
                }
            }
            if (count <= m) {
                rt = mid - 1;
                answer = mid;
            } else {
                lt = mid + 1;
            }
        }
        System.out.println(answer);

        br.close();
    }
}

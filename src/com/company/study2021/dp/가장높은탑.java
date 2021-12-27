package com.company.study2021.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 가장높은탑 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][3];
        int dy[] = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        dy[0] = arr[0][1];
        int answer = 0;
        for (int i=1; i<n; i++){
            int max =0;
            for (int j=0; j<i; j++) {
                if (arr[i][2] > arr[j][2]) {
                    max = Math.max(max ,dy[j]);
                }
            }
            dy[i] = max+arr[i][1];
            answer = Math.max(dy[i], answer );
        }
        System.out.println(answer);
    }
}

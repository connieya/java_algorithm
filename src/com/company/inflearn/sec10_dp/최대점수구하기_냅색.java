package com.company.inflearn.sec10_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대점수구하기_냅색 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int arr[][] = new int[count][2];
        for (int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int dy[]  = new int[minute+1];
        for (int i=0; i<count; i++) {
            for (int j=minute; j>=arr[i][1]; j--) {
                dy[j] = Math.max(dy[j], dy[j-arr[i][1]]+arr[i][0]);
            }
        }
        System.out.println(dy[minute]);

    }
}

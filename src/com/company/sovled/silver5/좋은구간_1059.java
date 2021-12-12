package com.company.sovled.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 좋은구간_1059 {
    static int min ,max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int arr[] = new int[L];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < L; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int n = Integer.parseInt(br.readLine());
        int idx  = 0;
        Arrays.sort(arr);
        for (int i=0; i<L; i++){
            if (arr[i] > L){
                idx = i;
                break;
            }
        }

    }
}

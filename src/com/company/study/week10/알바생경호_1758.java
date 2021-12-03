package com.company.study.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class 알바생경호_1758 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer arr[] = new Integer[n];
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        long sum =0;
        for (int i=0; i<n; i++){
            int tip = arr[i] - i;
            if (tip <= 0){
                break;
            }
            sum += tip;
        }
        System.out.println(sum);
    }
}

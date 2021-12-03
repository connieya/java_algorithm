package com.company.study.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 희주의수학시험_8974 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int arr[] = new int[1001];
        int index = 1;
        loop:for (int i=1; i<=1000; i++){
            for (int j=1; j<=i; j++){
                arr[index++] = i;
                if (index == 1001){
                    break loop;
                }
            }
        }
        int sum = 0;
        for (int i=a; i<=b; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        br.close();
    }
}

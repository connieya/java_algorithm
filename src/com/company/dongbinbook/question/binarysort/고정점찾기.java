package com.company.dongbinbook.question.binarysort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 고정점찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int start =0;
        int end = arr.length;
        int answer = -1;
        while (start <= end) {
            int mid = (start+end)/2;
            if (arr[mid]== mid){
                answer = mid;
                break;
            }
            if (arr[mid] > mid){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        System.out.println(answer);


    }
}

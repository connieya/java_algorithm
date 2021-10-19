package com.company.baekjoon.brute_force;

import java.io.*;

public class 모든순열_10974 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = i+1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        do {
            for (int a : arr) {
                bw.write(a+" ");
            }
            bw.write("\n");
            bw.flush();
        }while (next_permutation(arr));
        bw.close();
    }

    public static boolean next_permutation(int arr[]) {
        int i = arr.length-1;
        while (i> 0 && arr[i-1] > arr[i]) {
            i--;
        }

        if (i==0) {
            return false;
        }

        int j = arr.length-1;
        while (arr[i-1] > arr[j]) {
            j--;
        }
        int temp = arr[j];
        arr[j] = arr[i-1];
        arr[i-1] = temp;


        j = arr.length-1;
        while (i < j) {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        return true;
    }
}

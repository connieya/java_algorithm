package com.company.baekjoon.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 다음순열_10972 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        int i= 0;
        while (st.hasMoreElements()) {
            arr[i++] = Integer.parseInt(st.nextToken());
        }
        if (next_permutation(arr)) {
            for (int a : arr) {
                System.out.print(a+" ");
            }
        }else {
            System.out.println(-1);
        }
    }

    public static boolean next_permutation(int arr[]) {
        int i = arr.length -1;
        while (i > 0 && arr[i-1] > arr[i]) {
            i--;
        }
        if (i==0) {
            return false;
        }

        int j = arr.length -1;
        while (arr[i-1] >  arr[j]) {
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

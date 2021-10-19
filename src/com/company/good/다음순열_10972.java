package com.company.good;

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
        int j = arr.length -1;
        while (j > 0 && arr[j-1] > arr[j]) {
            j--;
        }
        if (j==0) {
            return false;
        }

        int i = arr.length -1;
        while (arr[j-1] >  arr[i]) {
            i--;
        }

        int temp = arr[i];
        arr[i] = arr[j-1];
        arr[j-1] = temp;

        i = arr.length-1;
        while (j < i) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
            i--;
        }
        return true;
    }
}

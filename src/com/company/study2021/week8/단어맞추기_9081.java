package com.company.study2021.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어맞추기_9081 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String str = br.readLine();
            int len = str.length();
            char arr[] = new char[len];
            for (int i=0; i<len; i++) {
                arr[i] = str.charAt(i);
            }
            StringBuilder sb = new StringBuilder();
            if (isNext_permutation(arr)){
                for (char ch : arr){
                    sb.append(ch);
                }
            }else {
                for (char ch: arr) {
                    sb.append(ch);
                }
            }
            System.out.println(sb);
        }
    }
    public static boolean isNext_permutation(char arr[]) {
        int i = arr.length-1;
        while (i > 0 && arr[i-1] >= arr[i]) {
            i--;
        }
        if (i == 0 ) {
            return false;
        }

        int j = arr.length-1;
        while (arr[i-1] >= arr[j]) {
            j--;
        }
        char temp = arr[j];
        arr[j] = arr[i-1];
        arr[i-1] = temp;

        j = arr.length-1;
        while (i<=j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return true;
    }
}

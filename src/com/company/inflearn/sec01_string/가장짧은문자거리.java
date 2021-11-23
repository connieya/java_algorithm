package com.company.inflearn.sec01_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장짧은문자거리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        char ch = st.nextToken().charAt(0);
        int arr[] = new int[str.length()];
        int p = 1000;
        for (int i=0; i<str.length(); i++){
            p++;
            if (str.charAt(i) == ch) {
                p = 0;
                arr[i] = p;
                continue;
            }
            arr[i] = p;
        }
        p = 1000;
        for (int i=str.length()-1; i>=0; i--){
            p++;
            if (str.charAt(i) == ch) {
                p = 0;
                arr[i] = p;
                continue;
            }
            arr[i] = Math.min(arr[i], p);
        }
        for (int a : arr){
            System.out.print(a+" ");
        }

    }
}

package com.company.baekjoon.brute_force;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 집합_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        int [] arr = new int[20];
        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int num;
            switch (str) {
                case "add" :
                    num = Integer.parseInt(st.nextToken());
                    arr[num-1] = 1;
                    break;
                case "remove" :
                    num = Integer.parseInt(st.nextToken());
                    arr[num-1] = 0;
                    break;
                case "check" :
                    num = Integer.parseInt(st.nextToken());
                    sb.append( (arr[num-1] == 1) ? 1 : 0).append("\n");
                    break;
                case "toggle" :
                    num = Integer.parseInt(st.nextToken());
                   arr[num-1] =  (arr[num-1] ==1) ? 0 : 1;
                   break;
                case "all" :
                    Arrays.fill(arr,1);
                    break;
                case "empty" :
                    Arrays.fill(arr, 0);

            }
        }
        bw.write(sb.toString());
        bw.flush();
    }
}

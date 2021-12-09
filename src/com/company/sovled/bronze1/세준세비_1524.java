package com.company.sovled.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 세준세비_1524 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- >0){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int s =0,b=0;
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<n; i++){
                s= Math.max(s,Integer.parseInt(st.nextToken()));
            }
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<m; i++){
                b= Math.max(b,Integer.parseInt(st.nextToken()));
            }
            sb.append(b>s?"B":"S").append("\n");
        }
        System.out.println(sb);
    }
}

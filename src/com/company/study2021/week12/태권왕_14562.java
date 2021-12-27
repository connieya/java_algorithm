package com.company.study2021.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 태권왕_14562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            System.out.println(dfs(s,t,0));
        }
    }
    public static int dfs(int s, int t , int count){
        if (s>t){
            return 100;
        }
        if (s == t) {
            return count;
        }
        int min1 = dfs(s*2 , t+3 , count+1);
        int min2 = dfs(s+1,t,count+1);
        return Math.min(min1,min2);
    }

}

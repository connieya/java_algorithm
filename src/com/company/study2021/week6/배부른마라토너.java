package com.company.study2021.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 배부른마라토너 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            String str= br.readLine();
            map.put(str , map.getOrDefault(str,0)+1);
        }
        for (int i=0; i<n-1; i++) {
            String str = br.readLine();
            map.put(str , map.get(str)-1);
            if (map.get(str)==0) {
                map.remove(str);
            }
        }
        for (String s : map.keySet()) {
            System.out.println(s);
        }
    }
}

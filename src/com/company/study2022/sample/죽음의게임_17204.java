package com.company.study2022.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 죽음의게임_17204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for (int i=0; i<n; i++){
            map.put(i,Integer.parseInt(br.readLine()));
        }
        int result = map.get(0);
        int ans = 1;
        while (result != k){
            result = map.get(result);
            ans++;
            if (ans > n){
                ans = -1;
                break;
            }
        }
        System.out.println(ans);
    }
}

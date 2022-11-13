package com.company.sovled.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 듣보잡_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<String > list = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        for (int i=0; i<n; i++){
            String a = br.readLine();
            list.add(a);
        }
        for (int i=0; i<m; i++){
            String a = br.readLine();
            if (list.contains(a)){
                ans.add(a);
            }
        }
        System.out.println(ans.size());
        Collections.sort(ans);
        for (String s : ans){
            System.out.println(s);
        }
    }
}

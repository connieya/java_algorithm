package com.company.sovled.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 싸이버개강총회_19583 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String start = st.nextToken();
        String end = st.nextToken();
        String end_s = st.nextToken();
        int count = 0;
        Set<String> set = new HashSet<>();
        Set<String> check = new HashSet<>();
        String temp = null;
        while ((temp=br.readLine())!=null){
            st = new StringTokenizer(temp , " ");
            String time = st.nextToken();
            String name = st.nextToken();
            if (time.compareTo(start) <= 0) {
                set.add(name);
            }else if (time.compareTo(end)>=0 && time.compareTo(end_s) <= 0){
               if (set.contains(name)){
                   check.add(name);
               }
            }
        }
        System.out.println(check.size());
    }
}

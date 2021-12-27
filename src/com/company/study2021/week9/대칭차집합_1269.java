package com.company.study2021.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 대칭차집합_1269 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Set<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<a; i++){
            int element = Integer.parseInt(st.nextToken());
            set.add(element);
        }
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<b; i++) {
            int element = Integer.parseInt(st.nextToken());
            if (!set.add(element)){
                set.remove(element);
            }
        }
        System.out.println(set.size());
        br.close();
    }

}

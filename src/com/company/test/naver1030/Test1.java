package com.company.test.naver1030;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        String [] id_list = {"A B C D", "A D", "A B D", "B D"};
        int k = 2;
        Map<String ,Integer> map = new HashMap<>();
        for (String str : id_list) {
            StringTokenizer st = new StringTokenizer(str);
            Set<String> set = new HashSet<>();
            while (st.hasMoreElements()) {
                set.add(st.nextToken());
            }
            for (String element : set) {
                if (map.getOrDefault(element , 0) < k) {
                    map.put(element , map.getOrDefault(element, 0)+1);
                }
            }
        }
        int sum =0;
        for (int value : map.values()) {
            sum += value;
        }
        System.out.println(sum);

    }
}

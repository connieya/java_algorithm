package com.company.test.naver1030;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        String logs[] = {"0001 3 95", "0001 5 90", "0001 5 100", "0002 3 95", "0001 7 80", "0001 8 80", "0001 10 90", "0002 10 90", "0002 7 80", "0002 8 80", "0002 5 100", "0003 99 90"};
        Map<String, Map<Integer, Integer>> map = new HashMap<>();
        Map<Integer, Integer> init = new HashMap<>();
        Set<String > set = new HashSet<>();
        for (String log : logs) {
            StringTokenizer st = new StringTokenizer(log);
            String id = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            int score =Integer.parseInt(st.nextToken());
            System.out.println(id + " : " + num +" : " + score);
            Map<Integer, Integer> map1 = map.getOrDefault(id ,init);

        }
        for (String s : map.keySet()) {
            System.out.println(s+" ,,,,"+ map.values() );

        }

    }
}

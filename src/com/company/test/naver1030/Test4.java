package com.company.test.naver1030;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        map.put("1001" ,3);
        map.put("1001" ,4);
        System.out.println(map.get("1001"));
        Map<String , Integer> map1 = new HashMap<>();
        map1.put("1001", 3);
        map1.put("1001", 5);
        System.out.println(map.equals(map1));
        int board[][] = new int[5][5];
        int length = board.length;
    }
}

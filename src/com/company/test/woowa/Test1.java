package com.company.test.woowa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        Map<Integer,Integer> map = new HashMap<>();
        for (int a : arr) {map.put(a , map.getOrDefault(a, 0) +1);

        }
        int max = 0;
        for (Integer value : map.values()) {
            max = Math.max(max, value);
        }
        System.out.println(max);
        int answer[] = new int[3];
        answer[0] = max - map.getOrDefault(1,0);
        answer[1] = max - map.getOrDefault(2,0);
        answer[2] = max - map.getOrDefault(3,0);
        System.out.println(Arrays.toString(answer));
    }
}

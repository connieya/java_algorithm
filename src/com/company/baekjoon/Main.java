package com.company.baekjoon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer , Character> map = new HashMap<>();
        map.put(3,'D');
        map.put(15,'L');
        System.out.println(map.get(3));
        System.out.println(map.get(4));

    }
}

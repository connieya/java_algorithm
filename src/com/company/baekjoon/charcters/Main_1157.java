package com.company.baekjoon.charcters;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = str.toUpperCase();

        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch,0)+1);
        }
        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        int max = Integer.MIN_VALUE;
        while (iterator.hasNext()){
            Integer value = iterator.next().getValue();
            if (value >=max){
                max = value;
            }
        }
        System.out.println(max);

    }
}

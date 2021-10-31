package com.company.study.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 학급회장_정답 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String student = br.readLine();
        String str = br.readLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch , map.getOrDefault(ch , 0) +1);
        }
        int max = Integer.MIN_VALUE;
        char answer = ' ';
        for (Character x : map.keySet()) {
            if (map.get(x) > max) {
                max = map.get(x);
                answer = x;
            }
        }
        System.out.println(answer);
    }
}

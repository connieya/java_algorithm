package com.company.study2021.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 아나그램 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isAnagram = true;
        Map<Character, Integer> map = new HashMap<>();
        String str1 = br.readLine();
        for (char ch : str1.toCharArray()){
            map.put(ch , map.getOrDefault(ch , 0)+1);
        }
        String str2 = br.readLine();
        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0){
                isAnagram = false;
                break;
            }
            map.put(ch , map.get(ch)-1);
        }
        if (isAnagram) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}

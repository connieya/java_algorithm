package com.company.inflearn.sec04_hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Hash4 {

    public int solution(String str1, String str2){

        int count = 0;

        HashMap<Character , Integer> map = new HashMap<>();

        for (char x : str2.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        Set<Map.Entry<Character, Integer>> char1 = map.entrySet();

        HashMap<Character,Integer> map2  = new HashMap<>();

        for (int i= 0; i<=str1.length()-str2.length(); i++){
            for (int j= i ; j<str2.length()+i; j++){
                map2.put(str1.charAt(j), map2.getOrDefault(str1.charAt(j),0)+1);

            }
            Set<Map.Entry<Character, Integer>> char2 = map2.entrySet();
            if (char1.equals(char2)) count++;
            map2.clear();

        }

        return count;
    }

    public static void main(String[] args) {


        Hash4 H = new Hash4();

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();

        String str2 = sc.next();

        System.out.println(H.solution(str1,str2));
    }
}

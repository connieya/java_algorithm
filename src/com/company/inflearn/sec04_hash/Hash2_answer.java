package com.company.inflearn.sec04_hash;

import java.util.HashMap;
import java.util.Scanner;

public class Hash2_answer {

    public String solution(String s1 , String s2){

        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s1.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for (char x : s2.toCharArray()){
            if (!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x,map.get(x)-1);
        }

        return  answer;
    }

    public static void main(String[] args) {

        Hash2_answer H = new Hash2_answer();

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        System.out.println(H.solution(a,b));


    }
}

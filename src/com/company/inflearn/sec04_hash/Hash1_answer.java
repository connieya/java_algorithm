package com.company.inflearn.sec04_hash;

import java.util.HashMap;
import java.util.Scanner;

public class Hash1_answer {

    public char solution(int n, String  str) {
        char answer= ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()){
            if (map.get(key)> max){
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Hash1_answer H = new Hash1_answer();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(H.solution(n,str));
    }
}

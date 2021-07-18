package com.company.inflearn.sec04_hash;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Hash2 {

    public String  solution(String str1 , String str2){

        HashMap<Character ,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for (char m1 : str1.toCharArray()){
            map1.put(m1, map1.getOrDefault(m1 , 0)+1);
        }

        for (char m2 : str2.toCharArray()){
            map2.put(m2,map2.getOrDefault(m2, 0)+1);
        }

        Set<Character> chars1 = map1.keySet();
        Set<Character> chars2 = map2.keySet();

        if (chars1 == chars2){
            return "YES";
        }else{
            return "NO";
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        Hash2 H = new Hash2();

        System.out.println(H.solution(str1,str2));
    }
}

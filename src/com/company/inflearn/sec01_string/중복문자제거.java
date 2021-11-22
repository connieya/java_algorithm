package com.company.inflearn.sec01_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class 중복문자제거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        LinkedHashSet<Character> hashSet = new LinkedHashSet<>();
        for (char c : str.toCharArray()){
            hashSet.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : hashSet){
            sb.append(c);
        }
        System.out.println(sb);
    }
}

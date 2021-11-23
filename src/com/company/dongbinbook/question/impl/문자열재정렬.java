package com.company.dongbinbook.question.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 문자열재정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = 0;
        List<Character> list = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                num += (ch - '0');
            } else {
                list.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(list);
        for (Character c : list) {
            sb.append(c);
        }
        if (num != 0) {
            sb.append(num);
        }
        System.out.println(sb);
    }
}

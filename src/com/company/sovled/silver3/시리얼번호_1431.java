package com.company.sovled.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 시리얼번호_1431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        while (n-- >0) {
            list.add(br.readLine());
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()){
                    if (getDigitSum(o1) == getDigitSum(o2)){
                        return o1.compareTo(o2);
                    }
                    return getDigitSum(o1) - getDigitSum(o2);
                }
                return o1.length() - o2.length();
            }
        });
        for (String s : list){
            System.out.println(s);
        }
    }
    public static int getDigitSum(String s){
        int num =0;
        for (char ch : s.toCharArray()){
            if (Character.isDigit(ch)){
                num += ch-'0';
            }
        }
        return num;
    }

}

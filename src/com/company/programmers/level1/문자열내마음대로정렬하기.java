package com.company.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        String [] strings = {"sun","bed","car"};
        int n = 1;
        List<String> strList = new ArrayList<>();
        for (String str : strings){
            strList.add(str.charAt(n)+str);
        }
        Collections.sort(strList);
        String answer[] = new String[strings.length];
        for(int i=0; i<strList.size(); i++){
            answer[i] = strList.get(i).substring(1);
        }
        for (String x : answer){
            System.out.print(x+" ");
        }
    }
}

package com.company.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wadeez {
    public static void main(String[] args) {
        Map<String  ,String > map = new HashMap<>();
        String sss="a=3";
        String code [] = {"a=3",
                "..a=4", "..b=3", "..print a", ".......a=6", ".......print a", ".......print b",
                "..print a", "....a=7", "....print a", "print a", "print b", "a=4", "print a", "...print a"};
        List<String> list = new ArrayList<>();
        for (String s : code){
            if (!s.contains("print") && s.lastIndexOf(".")!=-1){
                String value = s.substring(s.lastIndexOf(".")+1,s.length()-2);
                map.put(value, s.substring(s.length()-1));
            }
        }
        System.out.println(map);


    }
}

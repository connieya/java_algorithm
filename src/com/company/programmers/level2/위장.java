package com.company.programmers.level2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 위장 {
    public static void main(String[] args) {
        String [][] clothes = {
                {"yellow","headgear"},
                {"blue","eyewear"},
                {"green","headgear"}
        };
        Map<String ,Integer> map = new HashMap<>();
       for (int i=0; i< clothes.length; i++) {
           map.put(clothes[i][1] , map.getOrDefault(clothes[i][1],0)+1);
       }
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator));
        }
    }
}

package com.company.test.woowa;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Test3 {
    public static void main(String[] args) {
        int answer = 0;
        String [] ings = {"r 10", "a 23", "t 124", "k 9"};
        String [] menu = {"PIZZA arraak 145", "HAMBURGER tkar 180", "BREAD kkk 30", "ICECREAM rar 50", "SHAVEDICE rar 45", "JUICE rra 55", "WATER a 20"};
        String [] sell = {"BREAD 5", "ICECREAM 100", "PIZZA 7", "JUICE 10", "WATER 1"};
        Map<Character, Integer> ings_info = new HashMap<>();
        Map<String ,Integer> menu_info = new HashMap<>();
        for (String ing : ings) {
            StringTokenizer st = new StringTokenizer(ing);
            ings_info.put(st.nextToken().charAt(0) , Integer.parseInt(st.nextToken()));
        }
        for (String m : menu) {
            StringTokenizer st = new StringTokenizer(m);
            String name = st.nextToken();
            String info = st.nextToken();
            int price = Integer.parseInt(st.nextToken());
            int info_price = 0;
            for(char in : info.toCharArray()) {
                info_price += ings_info.get(in);
            }
            menu_info.put(name , price-info_price);
        }
        for (String s : sell) {
            StringTokenizer st = new StringTokenizer(s);
            String name = st.nextToken();
            int count = Integer.parseInt(st.nextToken());
            answer += menu_info.get(name) * count;
        }
        System.out.println(answer);

    }
}

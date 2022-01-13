package com.company.programmers;

import java.util.ArrayList;
import java.util.List;

public class Main  {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(142);
        list.add(14232);
        int index = 5;
        System.out.println(list);
        list.add(0,23);
        System.out.println(list);
//        while (index-- > 0){
//            System.out.println(list.get(1) +" " +list.size());
//            list.remove(1);
//        }
    }

}

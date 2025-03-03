package com.company.programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

//        for (int i = 0; i < ingredient.length; i++) {
//            list.add(ingredient[i]);
//            if (list.size() >= 4) {
//                int idx = list.size()-1;
//                if (list.get(idx) == 1 && list.get(idx - 1) == 3 && list.get(idx - 2) == 2 && list.get(idx - 3) == 1) {
//                        list.remove(idx-3);
//                        list.remove(idx-3);
//                        list.remove(idx-3);
//                        list.remove(idx-3);
//                }
//            }
//        }


        List<Integer> list=  new ArrayList<>();

        list.add(2); // 0
        list.add(1); // 1
        list.add(1); // 2
        list.add(2); // 3
        list.add(3); // 4
        list.add(1); // 5
////        list.add(1); // 6
////        list.add(1); // 7
//
        System.out.println("list = " + list);
        System.out.println("list.get(4) = " + list.get(4));
        System.out.println("list.get(3) = " + list.get(3));
        System.out.println("list.get(2) = " + list.get(2));
//
        list.remove(5-3);
        list.remove(5-3);
        list.remove(5-3);
        list.remove(5-3);


        System.out.println("list = " + list);
    }
}

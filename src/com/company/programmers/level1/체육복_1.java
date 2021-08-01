package com.company.programmers.level1;

import java.util.HashSet;

public class 체육복_1 {
    public static void main(String[] args) {
       int n =5;
       int lost[] = {2,4};
       int reserve[] = {3,5};
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<lost.length; i++) {
            set.add(lost[i]);
        }

        for (int i=0; i<reserve.length; i++) {
            if (set.contains(reserve[i])){
                set.remove(reserve[i]);
                continue;
            }
            if (set.contains(reserve[i]-1)) {
                set.remove(reserve[i]-1);
                continue;
            }
            if (set.contains(reserve[i]+1)) {
                set.remove(reserve[i]+1);
                continue;
            }

        }
        System.out.println(n-set.size());
    }
}

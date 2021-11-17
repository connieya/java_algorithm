package com.company.programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class 로또의최고순위와최저순위 {
    public static void main(String[] args) {
        int [] lottos = {44,1,0,0,31,25};
        int [] win_nums = {31,10,45,1,6,19};
        int zero = 0;
        int same = 0;
        Set<Integer> set = new HashSet<>();
        for (int lotto : lottos) {
            if (lotto == 0) {
                zero++;
                continue;
            }
            set.add(lotto);
        }
        for (int win : win_nums) {
            if (set.contains(win)){
                same++;
            }
        }


    }
}

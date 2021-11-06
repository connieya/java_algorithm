package com.company.test.woowa;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        String[] grid = {"A", "MAN", "DRINK", "WATER11"};
        String answer[] = new String[grid.length];
        int len = grid.length;
        for (int i = 0; i < answer.length; i++) {
            int j = len - i - 1; // 3,2,1,0; index
            String str = "";
            int start = 2*(i+1) -1;
            for (int k = j; k < grid.length; k++) {
                int index = j;
                while (start-- >0) {
                    str+= grid[index--];
                }
            }
            answer[i] =str;
        }
        System.out.println(Arrays.toString(answer));
    }
}

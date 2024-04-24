package com.company.test;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"ac", "c"};
        for (String str : strs) {
            int res = 0;
            for (Character ch : str.toCharArray()) {
                res += (ch-'a');
            }
            System.out.println("str =  " + str  +  " res =  " + res);
        }

    }
}

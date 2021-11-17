package com.company.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 쳬육복 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(10);
        set.add(15);
        set.remove(15);
        set.remove(10);
        set.remove(1);
        System.out.println(set);
        System.out.println(set.size());

    }
}

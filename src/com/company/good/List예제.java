package com.company.good;

import java.util.ArrayList;
import java.util.List;

public class List예제 {
    public static void main(String[] args) {
        List<String > list1 = new ArrayList<>();
        list1.add("FR");
        list1.add("AC");
        list1.add("CE");
        list1.add("DA");
        list1.add("CS");
        System.out.println(list1.remove("DS"));
    }
}

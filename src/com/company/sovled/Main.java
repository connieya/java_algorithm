package com.company.sovled;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
          List<Integer> list = new ArrayList<>();
          list.add(22);
          list.add(12);
          list.add(42);
          list.add(52);
          list.add(672);
        int i = list.indexOf(52);
        list.remove(i);
        System.out.println(list);
    }

}

package com.company.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> set = new ArrayList<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);
        set.remove(0);
        System.out.println(set);
    }
}

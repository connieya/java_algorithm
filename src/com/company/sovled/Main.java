package com.company.sovled;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
            System.out.println(func(12) == func(11));
            System.out.println(func(2) == func(1));
            System.out.println(func(5) == func(14));
            System.out.println(func(19) == func(51));
    }

    public static int func(int a) {
        return a % 2;
    }
}

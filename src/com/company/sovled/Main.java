package com.company.sovled;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main {
    static char c;
    public static void main(String[] args) {
        String str = "__*__";
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='*'){
                System.out.println(i);
                break;
            }
        }
    }
}

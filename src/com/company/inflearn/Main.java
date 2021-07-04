package com.company.inflearn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "aabcbcd";
        String t ="abc";
        int count = 0;
        while (s.indexOf(t)!=-1){
            int start = s.indexOf(t);
            int end = start+t.length();
            System.out.println(start+" "+end);
            StringBuilder sb = new StringBuilder();
            s = sb.append(s.substring(0,start)).append(s.substring(end)).toString();
            System.out.println(s);
            count++;
        }

        System.out.println(count);

    }
}

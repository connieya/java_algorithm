package com.company.test;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("d");
        String tstring = "this is {template} {template} is {state}";
        for(char ch : tstring.toCharArray()) {
            if(ch == 'i'){
                System.out.println(1);
            }
            if (ch == '{'){
                System.out.println(2);
            }
        }
        System.out.println(tstring.substring(1,1));
        tstring = tstring.replace("is","");
        System.out.println(tstring);
        char str[] = tstring.toCharArray();
        System.out.println(str.length);

    }
}

package com.company.programmers.level1;

import java.util.Locale;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        String s ="try hello world";
        s+=" ";
        StringBuilder sb = new StringBuilder();
        while (s.indexOf(" ")!=-1){
            int index = s.indexOf(" ");
            String str = s.substring(0, index);
            for (int i=0; i<str.length(); i++) {
                if (i % 2 == 0) {
                    sb.append(String.valueOf(str.charAt(i)).toUpperCase());
                } else {
                    sb.append(String.valueOf(str.charAt(i)).toLowerCase());
                }
            }
                sb.append(" ");
            s = s.substring(index+1);

        }
        System.out.println(sb.toString().substring(0,sb.toString().length()-1));
    }
}

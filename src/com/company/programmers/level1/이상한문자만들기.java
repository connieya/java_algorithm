package com.company.programmers.level1;


public class 이상한문자만들기 {
    public static void main(String[] args) {
        String s = "try hello world";
        int cnt =0;
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            cnt = c== ' ' ? 0 : cnt+1;
            if (cnt%2==0)  sb.append(Character.toLowerCase(c));
            else sb.append(Character.toUpperCase(c));

        }
        System.out.println(sb);
    }
}

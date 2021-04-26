package com.company.inflearn.readme;

public class Memo {

    public static void main(String[] args) {
        String exam = "geonhee";

        char[] chars = exam.toCharArray();
        chars[0] = chars[4];

        String s = String.valueOf(chars);
        System.out.println(s);

    }
}

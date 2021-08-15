package com.company.programmers;

public class Main2 {
    public static void main(String[] args) {
        String [] subway = {
                "1 2 3 4 5 6 7 8 9",
                "2 11",
                "0 11 10",
                "3 17 19 12 13 9 14 15 10",
                "20 2 21"

        };

        String s = "1 2 3 4 5 6 7 8 9";
        String s1 = s.replace(" ", "");
        int start = 1;
        int end = 9;
        String answer = String.valueOf(start)+String.valueOf(end);
        System.out.println(s1);
        System.out.println(answer);
        System.out.println(s1.contains(String.valueOf(end)));
    }
}

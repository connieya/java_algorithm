package com.company.programmers;

public class Main {
    public static void main(String[] args) {
        String str = "img12.png";
        String[] split = str.split("[0-9]");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

    }
}

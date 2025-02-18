package com.company.programmers.level0;

public class Chars {
    public static void main(String[] args) {
         String nums = "121212322";

        int sum = nums.chars().map(c -> c - '0').sum();
        System.out.println(sum);
    }
}

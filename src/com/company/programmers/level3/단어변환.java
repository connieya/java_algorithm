package com.company.programmers.level3;

import java.util.Arrays;

public class 단어변환 {
    static int min = Integer.MAX_VALUE;
    static boolean visited[];
    public static void main(String[] args) {
        String words[]  = {"hot", "dot", "dog", "lot", "log"};
        String begin = "hit";
        String target = "cos";
        visited = new boolean[words.length];
    }

    public static void dfs(String begin , String target , int count , String words []) {
        if (begin.equals(target)) {
            min = Math.min(min , count);
            return;
        }

        for (int i=0; i< words.length; i++) {
            String word = words[i];
            int num = 0;
            for (int j=0; j <word.length(); j++) {
                if (begin.charAt(j) ==  word.charAt(j)) {
                    num++;
                }
                if (num == begin.length()-1) {

                }
            }
        }

    }
}

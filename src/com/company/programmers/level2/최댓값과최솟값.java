package com.company.programmers.level2;

public class 최댓값과최솟값 {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        String[] temp = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int num = 0;
        for (String str : temp) {
            num = Integer.parseInt(str);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        String answer = ""+min+" "+max;
        System.out.println(answer);

    }
}

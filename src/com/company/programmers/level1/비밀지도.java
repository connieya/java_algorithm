package com.company.programmers.level1;

public class 비밀지도 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String str = Integer.toBinaryString(arr1[i] | arr2[i]);
            int strLength = str.length();
            String add = "";
            if (strLength < n) {
                for (int j = strLength; j < n; j++) {
                    add += "0";
                }
                str = add + str;
            }
            str = str.replaceAll("1", "#");
            str = str.replaceAll("0"," ");
            answer[i] = str;
        }
        for (String s : answer) {
            System.out.println(s);
        }
    }
}

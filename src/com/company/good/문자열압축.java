package com.company.good;

public class 문자열압축 {
    public static void main(String[] args) {
        String str = "aaadddeeencded";
        System.out.println(compressString(str));

    }

    public static String compressString(String str) {
        String newString = compress(str);
        return newString;
    }

    private static String compress(String str) {
        int count = 0;
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                if (count > 1) {
                    newString.append(count);
                }
                newString.append(str.charAt(i));
                count = 0;
            }
        }
        return newString.toString();
    }
}

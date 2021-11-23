package com.company.good;

public class 문자열압축 {
    public static void main(String[] args) {
        String str = "ancded";
        System.out.println(compressString(str));

    }
    public static String compressString(String str) {
        String newString = compress(str);
        return str.length() < newString.length() ? str : newString;

    }
    private static String compress(String str) {
        int count = 0;
        StringBuilder newString = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            count++;
            if (i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                newString.append(str.charAt(i));
                newString.append(count);
                count = 0;
            }
        }
        return newString.toString();
    }
}

package com.company.programmers.level2;

public class 다음큰숫자 {
    public static void main(String[] args) {
        int n = 78;
        String str = Integer.toBinaryString(n);
        int count =0;
        for (char c: str.toCharArray()){
            if (c=='1') count++;
        }
        do {
            n++;
            countNumberOne(n);
        }while (count !=countNumberOne(n));
        System.out.println(n);
    }
    static int countNumberOne(int n) {
        String s = Integer.toBinaryString(n);
        int count =0;
        for (char c : s.toCharArray()) {
            if (c=='1') count++;
        }
        return count;
    }
}

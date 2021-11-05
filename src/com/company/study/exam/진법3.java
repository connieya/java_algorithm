package com.company.study.exam;

public class 진법3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            StringBuilder sb = new StringBuilder();
            System.out.println(i + "->  " +toTrinaryDigit(i,sb));
        }
    }

    public static String toTrinaryDigit(int n, StringBuilder sb) {
        if (n == 0) return sb.toString();
        toTrinaryDigit(n / 3, sb);
        sb.append(n % 3);

        return sb.toString();
    }
}

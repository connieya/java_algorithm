package com.company.study.exam;

public class 진법2 {
    public static void main(String[] args) {
        for (int i=1; i<=30; i++) {
            StringBuilder sb = new StringBuilder();
            System.out.println(toBinary(i,sb));
        }
    }

    public static String toBinary(int n , StringBuilder sb) {
        if (n==0) return sb.toString();
        toBinary(n/2 , sb);
        sb.append(n % 2);

        return sb.toString();
    }
}

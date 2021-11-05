package com.company.programmers.level2;

public class 나라의숫자124 {


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(to(15,sb));


    }

    public static String  to(int n,  StringBuilder sb) {
        if (n==3) {
            sb.append(4);
            return sb.toString();
        }
        if (n % 3 == 0) {
           to(n/3-1 ,  sb);
            sb.append(4);
            return sb.toString();

        }

        if (n < 3) {
            sb.append(n);
            return sb.toString();
        }
        to(n / 3,   sb);
        sb.append(n % 3);
        return sb.toString();
    }
}

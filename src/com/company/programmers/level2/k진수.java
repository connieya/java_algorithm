package com.company.programmers.level2;

public class k진수 {
    public static void main(String[] args) {
        int n = 110011;
        int k = 10;
        StringBuilder sb = new StringBuilder();
        String result = "";
        if (k == 10) {
            result = String.valueOf(n);
        } else {
            result = to_k_Notation(n, k, sb);
        }
        System.out.println(result);
        String[] primes = result.split("0");
        for (String prime : primes) {
            System.out.println(prime);
        }

    }

    public static String to_k_Notation(int n, int k, StringBuilder sb) {
        if (n == 0) return sb.toString();
        to_k_Notation(n / k, k, sb);
        sb.append(n % k);
        return sb.toString();
    }
}

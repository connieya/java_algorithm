package com.company.good;

public class CompareToTest {
    public static void main(String[] args) {
        String A = "A"; //65
        String z = "z"; // 122
        System.out.println(A.compareTo(z)); // -57
        System.out.println(z.compareTo(A)); // 57

        System.out.println("a".compareTo("b")); // -1
        System.out.println("b".compareTo("a")); // 1

        System.out.println("aad".compareTo("aaa")); // 3
    }
}

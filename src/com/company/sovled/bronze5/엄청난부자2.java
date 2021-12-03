package com.company.sovled.bronze5;


import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class 엄청난부자2 {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        System.out.println(A.divide(B));
        System.out.println(A.mod(B));
    }
}

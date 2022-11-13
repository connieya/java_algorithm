package com.company.sovled;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        func(3,10); // true , false
        func(23,19); // false , true
        func(8,10); // false , false
        func(2,18); // true , true
    }
    public static void func(int value , int dir) {
        if (value < 5 || dir >= 17){
            System.out.println(1);
            return;
        }
        System.out.println(2);
    }

}

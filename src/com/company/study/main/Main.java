package com.company.study.main;

public class Main {
    public static void main(String[] args) {
        int num1 =10;
        int num2 =50;
        System.out.println(num1 + " " + num2);
        swap(num1 , num2);
        System.out.println(num1 + " " + num2);

    }
    public static void swap(int n1, int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
}

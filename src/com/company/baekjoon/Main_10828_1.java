package com.company.baekjoon;

public class Main_10828_1 {

    static int stack[] = new int[1000];
    static int size = 0;

    public static void main(String[] args) {

        push(4);
        push(10);
        push(32);
        System.out.println(size()); // 3
        System.out.println(empty()); // 0
        System.out.println(pop()); //32
        System.out.println(pop()); //10
        push(13);
        System.out.println(size()); //2
        System.out.println(pop()); // 13
        System.out.println(pop()); // 4
        System.out.println(pop()); // -1
        System.out.println(empty()); //1
        System.out.println(size()); //0

    }

    static void push(int data){
        stack[size++] = data;

    }
    static int pop(){
        if (size ==0) return -1;
        int value = stack[size-1];
        stack[size-1] = 0;
        size -= 1;


        return value;
    }

    static int size(){
        return size;
    }

    static int empty(){
        if (size == 0) return 1;
        return 0;
    }
    static int top(){
        if (size == 0) return -1;
        return stack[size-1];
    }
}

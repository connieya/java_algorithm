package com.company.test;

public class Person {
    int no = 10;
    String name;

    public Person(int no) {
        this.no = no;
        System.out.println("Person(int no) 호출됨");
    }

    public Person(int no, String name) {
        this.no = no;
        this.name = name;
        System.out.println("Person(int no,String name)  호출됨");
    }
}

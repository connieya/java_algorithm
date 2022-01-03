package com.company.algorithm;

import java.util.Arrays;

public class Fruit {
    String name;

    public Fruit(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[4];
        fruits[0] = new Fruit("apple");
        fruits[1] = new Fruit("banana");
        fruits[2] = new Fruit("orange");
        fruits[3] = new Fruit("cherry");
        Arrays.sort(fruits);
        for (Fruit fruit : fruits) {
            System.out.println(fruit.name);
        }
    }
}



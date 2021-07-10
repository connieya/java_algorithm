package com.company.inflearn.sec09;

import java.util.Arrays;
import java.util.Scanner;

public class 씨름선수_s {
    static class Person implements Comparable<Person>{
        int height, weight;
        public Person(int height ,int weight){
            this.height= height;
            this.weight= weight;
        }

        @Override
        public int compareTo(Person o) {
            return o.height - this.height;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Person [] person = new Person[N];
        for (int i=0; i<N; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
           person[i] = new Person(h,w);
        }
        Arrays.sort(person);

        int MAX = Integer.MIN_VALUE;
        int count =0;
        for (int i=0; i<N; i++){
            if (person[i].weight >MAX){
                MAX = person[i].weight;
                count++;
            }
        }
        System.out.println(count);
    }
}

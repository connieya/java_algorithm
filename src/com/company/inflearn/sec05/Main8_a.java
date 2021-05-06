package com.company.inflearn.sec05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;
    int priority;
    public Person(int id , int priority){
        this.id = id;
        this.priority = priority;
    }
}

public class Main8_a {


    public int solution(int[] array, int n, int m) {

        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for (int i=0; i<n; i++){
            Q.offer(new Person(i,array[i]));
        }
        while (!Q.isEmpty()){
            Person tmp = Q.poll();
            for (Person x : Q){
                if (x.priority>tmp.priority){
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null){
                answer++;
                if (tmp.id == m) return answer;

            }
        }


        return answer;


    }

    public static void main(String[] args) {

        Main8_a T = new Main8_a();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];

        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(T.solution(array,n,m));
    }
}

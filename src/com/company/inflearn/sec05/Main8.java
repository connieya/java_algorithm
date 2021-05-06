package com.company.inflearn.sec05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main8 {


    public int solution(int[] array, int n, int m) {

        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        for (int x : array) {
            queue.offer(x);
        }

        int c = array[m];


        return answer;


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];

        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
    }
}

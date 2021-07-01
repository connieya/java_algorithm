package com.company.baekjoon.queue;
import java.util.LinkedList;
import java.util.Scanner;

public class 회전하는큐_1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int array[] = new int[M];
        for (int i=0; i<M;i++){
            array[i] = sc.nextInt();
        }
        LinkedList<Integer> deque = new LinkedList<>();
        for (int i=1; i<=N; i++){
            deque.offer(i);
        }
        int count=0;
        for (int i=0; i<M; i++){
            int index = deque.indexOf(array[i]);
            int size = (deque.size() - 1)/2;

            if (array[i]==deque.peek()){
                deque.pollFirst();
            }else {
                if (size>=index){
                    while (deque.peek()!=array[i]){
                        deque.offerLast(deque.pollFirst());
                        count++;
                    }
                    deque.pollFirst();
                }else {
                    while (deque.peek()!=array[i]){
                        deque.offerFirst(deque.pollLast());
                        count++;
                    }
                    deque.pollFirst();
                }
            }

        }
        System.out.println(count);

    }
}

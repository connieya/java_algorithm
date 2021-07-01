package com.company.baekjoon;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i=1; i<=10; i++){
            deque.offer(i);
        }

        deque.pop();
        for (int i : deque){
            System.out.print(i+" ");
        }
    }

}

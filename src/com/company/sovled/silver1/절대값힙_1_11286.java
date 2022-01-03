package com.company.sovled.silver1;

import java.io.*;

public class 절대값힙_1_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        Heap heap = new Heap(n);

        while (n-- > 0) {
            int num = Integer.parseInt(br.readLine());
        }

    }
    private static class Heap {
        private int [] heap;
        private int size;

        public Heap(int n){
            this.heap = new int[n+1];
        }
        public void push(int num) {
            heap[++size] = num;

        }
        private void swap(int a, int b) {
            int temp = heap[a];
            heap[a] = heap[b];
            heap[b] =- temp;
        }
    }

}

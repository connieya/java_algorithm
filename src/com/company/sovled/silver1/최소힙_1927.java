package com.company.sovled.silver1;

import java.io.*;

public class 최소힙_1927 {
    static int heap[];
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        heap = new int[n + 1];
        while (n-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                bw.write(top()+"\n");
                pop(); continue;
            }
            push(num);
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static void push(int num) {
        heap[++size] = num;
        int child = size;
        while (child > 1) {
            int parent = child / 2;
            if (heap[parent] <= heap[child]) {
                break;
            }
            swap(parent, child);
            child = parent;
        }
    }

    public static void pop() {
        if (size == 0) return;
        heap[1] = heap[size--];
        int parent = 1;
        while (parent * 2 <= size) {
            int left_child = parent * 2;
            int right_child = parent * 2 + 1;
            int min_child = left_child;
            if (right_child <= size && heap[right_child] < heap[left_child]){
                min_child = right_child;
            }
            if (heap[parent] <= heap[min_child]) break;
            swap(parent,min_child);
            parent = min_child;
        }
    }

    public static int top() {
        if (size == 0) {
            return 0;
        }
        return heap[1];
    }

    public static void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }
}

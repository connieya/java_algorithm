package com.company.study2021.exam;

import java.util.LinkedList;

class Queue<T> {

}

class Graph {
    class Node{
        int data;
        LinkedList<Node> adjacent;
        boolean marked;

        public Node(int data) {
            this.data = data;
            this.adjacent = new LinkedList<Node>();
            this.marked = false;
        }
    }
    Node[] nodes;
    Graph(int size) {
        nodes = new Node[size];
        for (int i=0; i< size; i++) {
            nodes[i] = new Node(i);
        }
    }
}

public class Test {
    public static void main(String[] args) {

    }
}

package com.company.inflearn;

import java.util.Scanner;

public class Main {
    Node root;
    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        DFS(tree.root);

    }

    static void DFS(Node root) {
        if (root == null) return;

        System.out.print(root.data+"  ");
        DFS(root.lt);
        DFS(root.rt);

    }

    static class Node {
        int data;
        Node lt, rt;

        public Node(int val) {
            data = val;
            lt = rt = null;
        }
    }
}

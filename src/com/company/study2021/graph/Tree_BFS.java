package com.company.study2021.graph;

import java.util.LinkedList;
import java.util.Queue;

class Node1 {
    int data;
    Node1 lt, rt;

    public Node1(int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class Tree_BFS {
    Node1 root;

    public int BFS(Node1 root) {
        Queue<Node1> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node1 currentNode = queue.poll();
                if (currentNode.lt == null && currentNode.rt == null) {
                    return L;
                }
                if (currentNode.lt != null) {
                    queue.offer(currentNode.lt);
                }
                if (currentNode.rt != null) {
                    queue.offer(currentNode.rt);
                }
            }
            L++;

        }
        return L;

    }

    public static void main(String[] args) {
        Tree_BFS tree = new Tree_BFS();
        tree.root = new Node1(1);
        tree.root.lt = new Node1(2);
        tree.root.rt = new Node1(3);
        tree.root.lt.lt = new Node1(4);
        tree.root.lt.rt = new Node1(5);
        System.out.println(tree.BFS(tree.root));
    }
}

package com.company.inflearn.sec07;

import java.util.LinkedList;
import java.util.Queue;
class Node_B {
    Node_B lt, rt;
    int data;
    public Node_B(int val) {
        data = val;
        lt = rt = null;
    }
}
public class Tree말단노드_최소경로_BFS {
    Node_B root;
    public int BFS(Node_B root) {
        Queue<Node_B> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i=0; i<len; i++){
                Node_B current = queue.poll();
                if (current.lt== null&& current.rt == null) return L;
                if (current.lt!= null) queue.offer(current.lt);
                if (current.rt!=null) queue.offer(current.rt);
            }
            L++;
        }
        return 0;
    }
    public static void main(String[] args) {
        Tree말단노드_최소경로_BFS tree = new Tree말단노드_최소경로_BFS();
        tree.root = new Node_B(1);
        tree.root.lt = new Node_B(2);
        tree.root.rt = new Node_B(3);
        tree.root.lt.lt = new Node_B(4);
        tree.root.lt.rt = new Node_B(5);
        System.out.println(tree.BFS(tree.root));
    }
}

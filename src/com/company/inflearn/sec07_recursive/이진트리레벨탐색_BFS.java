package com.company.inflearn.sec07_recursive;

import java.util.LinkedList;
import java.util.Queue;

class Node_1 {
    int data;
    Node_1 lt, rt;

    public Node_1(int val) {
        data = val;
        lt = rt = null;
    }
}
public class 이진트리레벨탐색_BFS {
    Node_1 root;

    public void BFS(Node_1 root) {
        Queue<Node_1> Q = new LinkedList<>();
        Q.offer(root);
        int L =0;
        while (!Q.isEmpty()){
            int len = Q.size();
            System.out.print("레벨 "+L+" =");
            for (int i=0; i<len; i++){
                Node_1 current = Q.poll();
                System.out.print(current.data+" ");
                if (current.lt!= null) Q.offer(current.lt);
                if (current.rt!=null) Q.offer(current.rt);
            }
            L++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        이진트리레벨탐색_BFS tree = new 이진트리레벨탐색_BFS();
        tree.root = new Node_1(1);
        tree.root.lt = new Node_1(2);
        tree.root.rt = new Node_1(3);
        tree.root.lt.lt = new Node_1(4);
        tree.root.lt.rt = new Node_1(5);
        tree.root.rt.lt = new Node_1(6);
        tree.root.rt.rt = new Node_1(7);


        tree.BFS(tree.root);
    }
}

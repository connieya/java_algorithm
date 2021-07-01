package com.company.inflearn.sec07;

class Node_2{
    Node_2 lt ,rt;
    int data;
    public Node_2(int val){
        data =val;
        lt = rt = null;
    }
}

public class Tree말단노드_최소경로_DFS {
    Node_2 root;
    public int DFS(int L, Node_2 root){
        if (root.lt == null && root.rt  == null) return L;
        else return Math.min(DFS(L+1,root.lt),DFS(L+1,root.rt));
    }

    public static void main(String[] args) {
        Tree말단노드_최소경로_DFS tree =new Tree말단노드_최소경로_DFS();
        tree.root = new Node_2(1);
        tree.root.lt = new Node_2(2);
        tree.root.rt = new Node_2(3);
        tree.root.lt.lt = new Node_2(4);
        tree.root.lt.rt = new Node_2(5);
        System.out.println(tree.DFS(0,tree.root));

    }
}

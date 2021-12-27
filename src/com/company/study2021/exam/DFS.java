package com.company.study2021.exam;

class Node {
    int data;
    Node lt;
    Node rt;

    public Node(int data) {
        this.data = data;
        lt = null;
        rt = null;
    }
}

public class DFS {
    public static void main(String[] args) {
        Node node = new Node(1); // 객체 주소 100이라 가정
        node.lt = new Node(2); // 객체 주소 200
        node.rt = new Node(3); // 객체 주소 300
        node.lt.lt = new Node(4); // 객체 주소 400
        node.lt.rt = new Node(5); // 객체 주소 500
        node.rt.lt = new Node(6); // 객체 주소 600
        node.rt.rt = new Node(7); // 객체 주소 700

        dfs(node);
    }

    public static void dfs(Node node) {
        if (node == null) {
            return;
        }
        dfs(node.lt); // 완쪽 자식 먼저 깊게 탐색  32 line
        System.out.print(node.data + " ");// 부모 출력  33 line
        dfs(node.rt); // 오른쪽 자식 깊게 탐색  34 line
    }
}

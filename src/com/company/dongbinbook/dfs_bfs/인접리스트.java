package com.company.dongbinbook.dfs_bfs;

import java.util.ArrayList;

class Node {
    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public void show() {
        System.out.print("("+this.index+","+this.distance+")");
    }
}
public class 인접리스트 {
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<>();

    public static void main(String[] args) {
        for (int i =0; i<3; i++) {
            graph.add(new ArrayList<>());
        }

        // 노드 0에 연결된 노드 정보 저장 (노드, 거리)
        graph.get(0).add(new Node(1, 7));
        graph.get(0).add(new Node(2, 5));

        // 노드 1에 연결된 노드 정보 저장 (노드, 거리)
        graph.get(1).add(new Node(0, 7));

        // 노드 2에 연결된 노드 정보 저장 (노드, 거리)
        graph.get(2).add(new Node(0, 5));

        for (int i=0; i<3; i++) {
            for (int j=0; j<graph.get(i).size(); j++) {
                graph.get(i).get(j).show();
            }
            System.out.println();
        }

    }
}

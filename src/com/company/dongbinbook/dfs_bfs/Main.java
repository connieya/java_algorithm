package com.company.dongbinbook.dfs_bfs;

public class Main {
    public static void main(String[] args) {
        recursive_function(1);

    }
    public static void recursive_function(int i) {
        if (i==50) return;
        System.out.println(i+"번째 재귀 함수에서 "+(i+1)+"번 째 재귀 함수를 호출 합니다.");
        recursive_function(i+1);
        System.out.println(i+"번 째 재귀 함수를 종료 합니다.");
    }
}

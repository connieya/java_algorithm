package com.company.inflearn.sec07;

public class Main1 {
    public void DFS(int n){

        int sum = 0;
        if (n==0) return;
        else{
           DFS(n-1);
            System.out.print(n+" ");

        }
    }

    public static void main(String[] args) {
        Main1 T = new Main1();
        T.DFS(3);
    }
}

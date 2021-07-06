package com.company.inflearn;
public class Main {
    static int n;
    static boolean[] check;
    public static void main(String[] args) {
        n =3;
        check = new boolean[n+1];
        DFS(1);

    }
    static void DFS(int L){
        if (L == n+1){
            for (int i=1; i<=n; i++){
                if (check[i]){
                    System.out.print(i+" ");
                }
            }
            System.out.println();

        }else {
            check[L] = true;
            DFS(L+1);
            check[L] = false;
            DFS(L+1);
        }
    }
}

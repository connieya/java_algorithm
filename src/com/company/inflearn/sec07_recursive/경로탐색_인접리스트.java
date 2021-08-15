package com.company.inflearn.sec07_recursive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 경로탐색_인접리스트 {
    static int n, m, count = 0;
    static List<ArrayList<Integer>> list;
    static boolean ck[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        list = new ArrayList<ArrayList<Integer>>();
        ck = new boolean[n + 1];
        for (int k = 0; k <= n; k++) {
            list.add(new ArrayList<>());
        }

        while (m-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
        }
        DFS(1);
        System.out.println(count);
    }

    static void DFS(int L) {
        if (L == n) {
            count++;
            return;
        }
        for (int nv : list.get(L)) {
            if (!ck[nv]) {
                ck[L] = true;
                DFS(nv);
                ck[L] = false;
            }
        }

    }
}

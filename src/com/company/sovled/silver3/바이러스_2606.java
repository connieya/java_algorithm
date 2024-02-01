package com.company.sovled.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 바이러스_2606 {

    static int parent[];

     static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a < b) {
            parent[b] = a;
        }else {
            parent[a] =b;
        }
    }

    static int find(int num) {
        if (num == parent[num]) {
            return num;
        }
        return parent[num] = find(parent[num]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        int ans = 0;

        for (int i = 0; i < m; i++) {
            String[] tmp = bf.readLine().split(" ");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);
            union(a,b);
        }
        for (int i=2; i<=n; i++){
            if(find(parent[i]) == 1){
                ans++;
            }
        }
        System.out.println(ans);
    }
}

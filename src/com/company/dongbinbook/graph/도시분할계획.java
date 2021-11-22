package com.company.dongbinbook.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class City implements Comparable<City> {
    int a;
    int b;
    int cost;

    public City(int a, int b, int cost) {
        this.a = a;
        this.b = b;
        this.cost = cost;
    }

    @Override
    public int compareTo(City o) {
        return this.cost - o.cost; // 작은 비용 순서대로
    }
}

public class 도시분할계획 {
    static int parent[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N  = Integer.parseInt(st.nextToken());
        int M  = Integer.parseInt(st.nextToken());
        parent = new int[N+1];
        int result = 0;
        for (int i=1; i<=N; i++) {
           parent[i] = i;
        }
        List<City> cities = new ArrayList<>();
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            cities.add(new City(a,b,cost));
        }
        Collections.sort(cities);
        int last = 0;
        for (City city : cities){
            if (find(city.a) != find(city.b)) {
                union(city.a,city.b);
                result += city.cost;
                last = city.cost;
            }
        }
        System.out.println(result-last);
    }
    public static int find(int x) {
        if (x == parent[x]) return x;
        return parent[x] = find(parent[x]);
    }

    public static void union(int a , int b){
        a = find(a);
        b = find(b);
        if (a< b) {
            parent[b] = a;
            return;
        }
        parent[a] = b;
    }
}

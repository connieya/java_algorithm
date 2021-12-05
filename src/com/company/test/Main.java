package com.company.test;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Order implements Comparable<Order> {
    String name;
    int time;
    int index;

    public Order(String name, int time, int index) {
        this.name = name;
        this.time = time;
        this.index = index;
    }

    @Override
    public int compareTo(Order o) {
        return this.time - o.time;
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 3;
        String recipes[] = {"SPAGHETTI 3", "FRIEDRICE 2", "PIZZA 8"};
        String orders[] = {"PIZZA 1", "FRIEDRICE 2", "SPAGHETTI 4", "SPAGHETTI 6", "PIZZA 7", "SPAGHETTI 8"};
        int len = orders.length;

        Map<String, Integer> map = new HashMap<>();
        for (String recipe : recipes) {
            StringTokenizer st = new StringTokenizer(recipe);
            String menu_name = st.nextToken();
            int cooking_time = Integer.parseInt(st.nextToken());
            map.put(menu_name, cooking_time);
        }
        PriorityQueue<Order> pq = new PriorityQueue<>();
        if (len < n) {
            StringTokenizer st = new StringTokenizer(orders[len - 1]);
            String name = st.nextToken();
            int order_num = Integer.parseInt(st.nextToken());
            System.out.println(order_num + map.get(name));
        }


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(orders[i]);
            String name = st.nextToken();
            int order_num = Integer.parseInt(st.nextToken());
            int time = map.get(name);
            pq.offer(new Order(name, order_num + time, i));
        }
        for (int i = n; i < orders.length; i++) {
            StringTokenizer st = new StringTokenizer(orders[i]);
            String name = st.nextToken();
            int order_num = Integer.parseInt(st.nextToken());
            Order completed = pq.poll();
            if (completed.time >= order_num) {
                pq.offer(new Order(name, completed.time + map.get(name), i));
            } else {
                pq.offer(new Order(name, order_num + map.get(name), i));
            }
        }
        while (!pq.isEmpty()){
            Order order = pq.poll();
            if (order.index == len-1){
                System.out.println(order.time);
                break;
            }
        }
    }

}

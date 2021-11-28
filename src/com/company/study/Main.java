package com.company.study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Product {
    int price;
    int count;

    public Product(int price, int count) {
        this.price = price;
        this.count = count;
    }
}

public class Main {
    public static void main(String[] args) {
       String record[] ={"P 300 6", "P 500 3", "S 1000 4", "P 600 2", "S 1200 1"};

        Queue<Product> queue = new LinkedList<>();
        int fifo = 0;
       for (String product : record){
           StringTokenizer st = new StringTokenizer(product);
           String info  = st.nextToken();
           int price = Integer.parseInt(st.nextToken());
           int count = Integer.parseInt(st.nextToken());
           if (info.equals("P")){
               queue.offer(new Product(price,count));
               continue;
           }
           if (queue.peek().count < count){
               while (count > 0){
                   fifo += queue.peek().count * queue.poll().price;
                   count -= queue.peek().count;
                   queue.poll();

               }
           }

       }
    }
}

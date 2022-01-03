package com.company.sovled.silver1;

import java.io.*;
import java.util.PriorityQueue;

class Comp implements Comparable<Comp> {
    int num;

    public Comp(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(Comp o) {
        if (Math.abs(this.num) == Math.abs(o.num)){
            return this.num - o.num;
        }
        return Math.abs(this.num) - Math.abs(o.num);
    }
}

public class 절대값힙_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Comp> pq = new PriorityQueue<>();
        while (n-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0 && !pq.isEmpty()) {
                bw.write(pq.poll().num+"\n");
            }else if (num == 0 && pq.isEmpty()){
                bw.write(0+"\n");
            }else {
                pq.add(new Comp(num));
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

package com.company.programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Stage implements Comparable<Stage> {
    double rate;
    int index;

    public Stage(double rate, int index) {
        this.rate = rate;
        this.index = index;
    }

    @Override
    public int compareTo(Stage o) { // double 형 비교
        if (this.rate == o.rate) {
            return this.index - o.index;
        }

        return Double.compare(o.rate, this.rate);
    }
}

public class 실패율 {
    public static void main(String[] args) {
        int n = 4;
        int[] stages = {4,4,4,4,4};
        Stage result[] = new Stage[n];
        int len = stages.length;
        double users = stages.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int v = stages[i];
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            int cnt = map.getOrDefault(i + 1, 0);
            if (users == 0) {
                result[i] = new Stage(0, i + 1);
                continue;
            }
            result[i] = new Stage( cnt / users, i + 1);
            users -= cnt;
        }
        Arrays.sort(result);
        for (int i=0; i<n; i++) {
            System.out.println(result[i].index +" "+  result[i].rate);
        }

    }
}

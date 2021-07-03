package com.company.programmers.level1;

import java.util.*;

public class 모의고사_1 {
    public static void main(String[] args) {
        int answers[] = {5,0,2,7};
        Set<Integer> set = new HashSet<>();
        for (int i=0; i< answers.length-1; i++){
            for (int j=i+1; j< answers.length; j++){
                set.add(answers[i]+answers[j]);
            }
        }
        set.stream().sorted().mapToInt(Integer::intValue).toArray();
        for (int x: set){
            System.out.print(x+" ");
        }

    }
}

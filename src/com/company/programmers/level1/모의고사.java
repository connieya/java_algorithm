package com.company.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 모의고사 {
    public static void main(String[] args) {
        int nums[] = {5,0,2,7};
        List<Integer> list = new ArrayList<>();
        for (int i=0; i< nums.length-1; i++){
            for (int j=i+1; j< nums.length; j++){
                int sum = nums[i]+nums[j];
                if (!list.contains(sum)){

                    list.add(sum);
                }
            }
        }
        Collections.sort(list);
        for (int x: list){
            System.out.print(x+" ");
        }

    }
}

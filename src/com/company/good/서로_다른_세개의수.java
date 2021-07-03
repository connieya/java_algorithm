package com.company.good;

public class 서로_다른_세개의수 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,13,332,44,13,23};
        int count = 0;
        for (int i=0; i< nums.length-2; i++ ){
            for (int j= i+1; j< nums.length-1; j++){
                for (int k= j+1; k< nums.length; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    System.out.println(++count+":"+ sum);
                }
            }
        }
    }
}

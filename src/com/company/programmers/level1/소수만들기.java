package com.company.programmers.level1;

public class 소수만들기 {
    public static void main(String[] args) {
        boolean [] prime = new boolean[3000];
        for (int i=2; i*i<prime.length; i++){
            if (prime[i]) continue;
            for (int j= i+i; j< prime.length; j+=i){
                prime[j]= true;
            }
        }
        int nums[] = {1,2,3,4};
        int count =0;
        for (int i=0; i< nums.length-2; i++){
            for (int j=i+1;j<nums.length-1; j++){
                for (int k=j+1; k< nums.length;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if (!prime[sum]){
                        count++;
                    }

                }
            }
        }
        System.out.println(count);

    }
}

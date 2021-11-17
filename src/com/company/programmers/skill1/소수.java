package com.company.programmers.skill1;

public class 소수 {
    public static void main(String[] args) {
        int answer = 0;
        int nums[]  = {1,2,3,4};
        boolean isPrime[] = new boolean[3000];
        for(int i=2; i*i < 3000; i++) {
            if(isPrime[i]){
                continue;
            }
            for(int j=i+i; j<3000; j+=i){
                isPrime[j] = true;
            }
        }
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(!isPrime[sum]){
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}

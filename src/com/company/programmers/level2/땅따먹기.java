package com.company.programmers.level2;

public class 땅따먹기 {
    public static void main(String[] args) {
        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        Math.max(land[0][0],Math.max(land[0][1],land[0][2]));
    }
}

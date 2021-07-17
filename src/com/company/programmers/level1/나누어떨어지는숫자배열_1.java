package com.company.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열_1 {
    public static void main(String[] args) {
        int arr[] = {5,9,7,10,4};
        int n = 2;
        int answer[] = Arrays.stream(arr).filter(factor -> factor% n ==0).toArray();
        if (answer.length  ==0) answer = new int[]{-1};
        Arrays.sort(answer);

        for (int i=0; i<5; i++){

        }
    }
}


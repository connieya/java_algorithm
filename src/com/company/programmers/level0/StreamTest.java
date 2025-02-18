package com.company.programmers.level0;

import java.util.Arrays;

public class StreamTest {
    public static void main(String[] args) {
        int []arr = {23,21,11,33};

        int[] array = Arrays.stream(arr).limit(2).toArray();
    }
}

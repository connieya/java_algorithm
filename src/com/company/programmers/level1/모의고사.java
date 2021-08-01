package com.company.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 모의고사 {
    public static void main(String[] args) {
        int answers[] = {1, 2, 3, 4, 5};
        int student1 [] = {1,2,3,4,5};
        int student2 [] = {2,1,2,3,2,4,2,5};
        int student3 [] = {3,3,1,1,2,2,4,4,5,5};
        for (int i=0; i< answers.length; i++) {
            answers[i] = student1[i%5];
        }
    }
}

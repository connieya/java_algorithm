package com.company.programmers.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Rec {

    public ArrayList<Integer> solution(int v[][]) {

        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        int c = 0;
        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                c= v[j][i];
                map.put(c, map.getOrDefault(c,0)+1);
                if (map.get(c) ==1){
                    map.remove(c);
                }
                for (int aw : map.keySet()){
                    answer.add(aw);
                }
            }

        }



        return answer;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][]v = {{1, 4}, {3, 4}, {3, 10}};

        Rec R = new Rec();

        for (int x : R.solution(v)){
            System.out.print(x + " ");
        }
    }
}

package com.company.programmers.level1;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        int win_nums[] = {38,19,20,45,15,25};
        int lottos [] = {0,0,0,0,0,0};

        int count = 0;
        int unknown = 0;
        for (int i=0; i<6; i++){
            for (int j=0; j<6; j++){
                if (lottos[i] == win_nums[j]){
                    count++;
                    break;
                }else if(lottos[i] == 0){
                    unknown++;
                    break;
                }
            }
        }
        int best = count+unknown;
        int worst = count;
        int answer[] = {ranking(best),ranking(worst)};
        System.out.println(answer[0]+","+answer[1]);
    }
    public static int ranking(int score){
        switch (score){
            case 6 : return  1;
            case 5 : return 2;
            case 4 : return 3;
            case 3 : return 4;
            case 2: return 5;
            default:return 6;
        }
    }
}

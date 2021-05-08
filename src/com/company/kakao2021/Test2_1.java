package com.company.kakao2021;

public class Test2_1 {
    public static void main(String[] args) {

        String [][] places = { {"POOOP" , "OXXOX", "OPXPX" ,"OOXOX","POXXP"},
                {"POOPX","OXPXP","PXXXO","OXXXO","OOOPP"}};
        System.out.println(places[0][0].charAt(0));
        System.out.println(places[0][1]);
        System.out.println(places[0][2]);
        System.out.println(places[0][3]);
        System.out.println(places[0][4]);

        char [][] array = new char[5][5];

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                for (char x : places[i][j].toCharArray()){
                            if (x =='P');

                }
            }
        }
    }
}

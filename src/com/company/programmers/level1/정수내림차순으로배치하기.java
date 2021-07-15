package com.company.programmers.level1;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {
        int n = 118372;
        String[] split = String.valueOf(n).split("");
        for (int i=0; i<split.length-1; i++){
            for (int j=0; j<split.length-1-i; j++){
                if (Integer.parseInt(split[j])< Integer.parseInt(split[j+1])){
                    String temp = split[j];
                    split[j] =split[j+1];
                    split[j+1] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str : split){
            sb.append(str);
        }
       Long.parseLong(sb.toString());
    }
}

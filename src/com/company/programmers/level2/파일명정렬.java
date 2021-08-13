package com.company.programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

public class 파일명정렬 {
    public static void main(String[] args) {
        String [] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String head1 = o1.split("[0-9]")[0];
                String head2 = o2.split("[0-9j]")[0];

                int result = head1.toLowerCase().compareTo(head2.toLowerCase());
                if (result ==0){
                    o1 =o1.substring(head1.length());
                    o2 =o2.substring(head1.length());
                    int i = convertNum(o1) - convertNum(o2);
                    if (i==0){
                        String tail1 = o1.split("[0-9]")[1];
                        String tail2 = o2.split("[0-9j]")[1];
                        return tail1.compareTo(tail2);
                    }
                    return i;
                }
                return result;
            }
        });
    }
    static int convertNum(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)){
                sb.append(c);
            }
        }
        return Integer.valueOf(sb.toString());
    }
}

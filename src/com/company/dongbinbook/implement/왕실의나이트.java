package com.company.dongbinbook.implement;

import java.util.Scanner;

public class 왕실의나이트 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int row = str.charAt(1) - '1';
        int column = str.charAt(0) - 'a';
        int dx[] = {-2, -2, -1, 1, 2, 2, -1, 1};
        int dy[] = {1, -1, 2, 2, 1, -1, -2, -2};
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int nx = row + dx[i];
            int ny = column + dy[i];
            if (nx >= 0 && ny >= 0 && nx < 8 && ny < 8) {
                count++;
            }
        }
        System.out.println(count);

    }
}

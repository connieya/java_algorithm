package com.company.sovled.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 지뢰찾기_1996 {
    static int dx[] = {-1, -1, -1, 0, 1, 1, 1, 0};
    static int dy[] = {-1, 0, 1, 1, 1, 0, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char map[][] = new char[n][n];
        char answer[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(answer[i], '0');
        }
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Character.isDigit(map[i][j])) {
                    answer[i][j] = '*';
                    for (int k = 0; k < 8; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx >= 0 && nx < n && ny >= 0 && ny < n && answer[nx][ny] != 'M' &&answer[nx][ny] != '*'){
                            answer[nx][ny] += (map[i][j]-48);
                            if(answer[nx][ny] > 57){
                                answer[nx][ny] ='M';
                            }
                        }
                    }
                }
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }
    }
}

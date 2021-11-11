package com.company.study.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 배열돌리기3_16935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int arr[][] = new int[N][M];
        int result[][];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        while (R-- > 0) {
            int operation = Integer.parseInt(st.nextToken());
            if (operation == 1) {
                for (int i=0; i<N/2; i++ ){
                    for (int j=0; j<M; j++) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[N-1-i][j];
                        arr[N-1-i][j] = temp;
                    }
                }
                continue;
            }
            if (operation == 2) {
                for (int i=0; i<N; i++ ){
                    for (int j=0; j<M/2; j++) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][M-1-j];
                        arr[i][M-1-j] = temp;
                    }
                }
                continue;
            }
            if (operation == 3) {
                result = new int[M][N];
                for (int i=0; i<N; i++) {
                    for (int j=0; j<M; j++) {
                      result[j][N-1-i] = arr[i][j];
                    }
                }
                arr = result;
                int temp = N;
                N = M;
                M = temp;

                continue;
            }

            if (operation == 4) {
                result = new int[M][N];
                for (int i=M-1; i>=0; i--) {
                    for (int j=0; j<N; j++) {
                        result[M-i-1][j] = arr[j][i];
                    }
                }
                arr = result;
                int temp = M;
                M = N;
                N = temp;
                continue;
            }
            if (operation == 5) {
                for (int i=0; i<N/2; i++) {
                    for (int j=0; j<M/2; j++) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][M/2+j];
                        arr[i][M/2+j] = temp;
                    }
                }
                for (int i=0; i<N/2; i++) {
                    for (int j=0; j<M/2; j++) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[N/2+i][M/2+j];
                        arr[N/2+i][M/2+j] = temp;
                    }
                }
                for (int i=0; i<N/2; i++) {
                    for (int j=0; j<M/2; j++) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[N/2+i][j];
                        arr[N/2+i][j] = temp;
                    }
                }
                continue;
            }
            if (operation == 6) {
                for (int i=0; i<N/2; i++) {
                    for (int j=0; j<M/2; j++) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[N/2+i][j];
                        arr[N/2+i][j] = temp;
                    }
                }
                for (int i=0; i<N/2; i++) {
                    for (int j=0; j<M/2; j++) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[N/2+i][M/2+j];
                        arr[N/2+i][M/2+j] = temp;
                    }
                }
                for (int i=0; i<N/2; i++) {
                    for (int j=0; j<M/2; j++) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][M/2+j];
                        arr[i][M/2+j] = temp;
                    }
                }
                continue;
            }
        }
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}

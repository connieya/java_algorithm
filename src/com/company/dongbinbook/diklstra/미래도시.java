package com.company.dongbinbook.diklstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 미래도시 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [][] graph = new int[n+1][n+1];
        for (int i=1; i<=n; i++) {
            Arrays.fill(graph[i], 100_000);
        }
        for (int a=1; a<=n; a++) {
            for (int b =1; b<=n; b++){
                if (a==b) {
                    graph[a][b] = 0;
                }
            }
        }
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int k=1; k<=n; k++) {
            for (int a=1; a<=n; a++){
                for (int b=1; b<=n; b++) {
                    graph[a][b] = Math.min(graph[a][b] , graph[a][k] + graph[k][b]);
                }
            }
        }

        int distance = graph[1][K] + graph[K][X];
        if (distance >= 100_000) {
            System.out.println(-1);
        }else {
            System.out.println(distance);
        }
    }
    /*
 5 7
1 2
1 3
1 4
2 4
3 4
3 5
4 5
4 5
*/


 /*
 4 2
 1 3
 2 4
 3 4

 * */
}

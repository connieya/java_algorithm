package com.company.sovled.silver5;

import java.io.*;
import java.util.*;

public class 회사에있는사람_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String  arr[] = new String[n];
        for (int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name =st.nextToken();
            String log = st.nextToken();
            arr[i] = name;
        }
        Arrays.sort(arr);
        for (int i=n-1; i>=0; i--){
            if (i == 0 && arr[i] != arr[i+1]){
                bw.write(arr[i]+"\n");
                break;
            }
            if (arr[i].equals(arr[i-1])){
                i--;
            }else {
                bw.write(arr[i]+"\n");
            }

        }
        bw.flush();
        bw.close();
        br.close();
    }
}

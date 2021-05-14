package com.company.baekjoon.stack;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main_10828 {
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        int [] stack = new int[n];
        int size = 0;
        while (n-- > 0){
            String cmd = sc.next();
            if (cmd.equals("push")){
                int num = Integer.parseInt(sc.next());
                stack[size++] = num;
            }else if(cmd.equals("top")){
                if (size == 0 ){
                    bw.write("-1\n");
                }else {
                    bw.write(stack[size-1]+"\n");
                }
            }else if(cmd.equals("size")){
                bw.write(size+"\n");
            }
        }
    }

}

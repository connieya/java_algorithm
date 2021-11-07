package com.company.programmers.level3;

import java.util.LinkedList;
import java.util.Queue;

class Word {
    String word;
    int count;

    public Word(String word, int count) {
        this.word = word;
        this.count = count;
    }
}

public class 단어변환_BFS {
    static boolean visited[];

    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String words[] = {"hot", "dot", "dog", "lot", "log"};
        int answer = 0;
        visited = new boolean[words.length];
        Queue<Word> queue = new LinkedList<>();
        queue.offer(new Word(begin, 0));
        while (!queue.isEmpty()) {
            Word current = queue.poll();
            if (current.word.equals(target)) {
                answer = current.count;
                break;

            }
            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && isPossibleNextStep(words[i], current.word)) {
                    visited[i] = true;
                    queue.offer(new Word(words[i], current.count + 1));
                }

            }
        }
        System.out.println(answer);
    }

    static boolean isPossibleNextStep(String word, String begin) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != begin.charAt(i)) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }

        return true;
    }
}

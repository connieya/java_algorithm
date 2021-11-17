package com.company.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

class Task {
    int priority;
    int location;

    public Task(int priority, int location) {
        this.priority = priority;
        this.location = location;
    }
}

public class 프린터 {
    public static void main(String[] args) {
        int [] priorities = {1,1,9,1,1};
        int location = 0;
        int count = 0;
        Queue<Task> queue = new LinkedList<>();
        for (int i=0; i<priorities.length; i++){
            queue.offer(new Task(priorities[i], i));
        }
        while (!queue.isEmpty())  {
            Task current = queue.poll();
            boolean isMaxPriority = true;
            for (Task task : queue) {
                if (task.priority > current.priority){
                    isMaxPriority = false;
                    break;
                }
            }
            if (isMaxPriority) {
                ++count;
                if (current.location == location){
                    break;
                }
            }else {
                queue.add(current);
            }
        }
        System.out.println(count);
    }
    
}

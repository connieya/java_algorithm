# [x만큼 간격이 있는 n개의 숫자](https://school.programmers.co.kr/learn/courses/30/lessons/12954)

## solution 1

```java
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long v =x;
        for (int i=0; i<n; i++){
            answer[i] = v*(i+1);
            
        }
        return answer;
    }
}
```

## solution 2

```java
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for(int i=1; i<n; i++) {
            answer[i] = answer[i-1] + x;
        }
        return answer;
    }
}
```
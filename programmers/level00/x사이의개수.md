# [x 사이의 개수](https://school.programmers.co.kr/learn/courses/30/lessons/181867)

문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.



## solution 1


```java
import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        int len = 0;
        for(char ch : myString.toCharArray()) {
            if(ch == 'x'){
                list.add(len);
                len = 0;
            }else {
                len++;
            }
        }
        list.add(len);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
        
    }
}
```

## solution 2

split 

        String[] result1 = str.split(",", 2);  // 최대 2개만 분할
        String[] result2 = str.split(",", 0);  // 기본 동작 (맨 끝 빈 문자열 제거)
        String[] result3 = str.split(",", -1); // 모든 요소 반환



````java
import java.util.*;
class Solution {
    public int[] solution(String myString) {
        return Arrays
            .stream(myString.split("x",-1))
            .mapToInt(String::length).toArray();
        
    }
}
````
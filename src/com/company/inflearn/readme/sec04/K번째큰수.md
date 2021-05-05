# 5. K번째 큰 수
## 설명

현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.

현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.

기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.

만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.


## 입력

첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.


## 출력
첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.

## 풀이 

아 너무 어렵다..

tow pointer 알고리즘으로 풀다가 .. 도저히 안되네..
```java

public class Hash5 {

    public static void main(String[] args) {

        int arr[] = new int[]{13, 15, 34, 23, 45, 65, 33, 11, 26, 42};

        ArrayList<Integer> answer = new ArrayList<>();

        int sum = 0;
        int lt = 0 , rt =0;
        for (int i = lt; i<2+lt; i++) {

            sum += arr[i];
            System.out.println("i = " +i +" sum ="+sum);


            while (i >= 1+lt){
                for ( rt = 2+lt; rt < arr.length; rt++) {
                    sum += arr[rt];
                    answer.add(sum);
                    sum -= arr[rt];
                }

                lt++;
            }

        }





        for (int x : answer) {
            System.out.print(x + " ");
        }

    }
}
```

3중 for문으로 풀어도 안되네..
```java

public class Hash05_answer {

    public static void main(String[] args) {

        ArrayList<Integer> answer = new ArrayList<>();

        int[] arr = new int[]{13, 15, 34, 23, 45, 65, 33, 11, 26, 42};

        int sum = 0;
        for (int i = 0; i < 2; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int k = 2; k < arr.length; k++) {

                for (int j = k; j < arr.length; j++) {
                    sum += arr[j];
                    answer.add(sum);
                    sum -= arr[j];
                }

                sum -= arr[i];
                sum += arr[k];
            }
        }

        for (int x :  answer){
            System.out.println(x+ " ");
        }
    }
}

```

## 강사님 풀이

3중 for문과 
TreeSet ... 굿!!

```java
public class Hash05_answer {
    public int solution(int []arr, int n , int k){
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); // 내림 차순

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                for (int l=j+1; l<n; l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt =0;
        for (int x : Tset){
            cnt++;
            if (cnt == k) return x;
        }

        return answer;
    }

    public static void main(String[] args) {

      Hash05_answer H = new Hash05_answer();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[n];
        for (int  i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(H.solution(arr,n,k));
    }


}

```
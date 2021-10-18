
```java
   public static void main(String[] args) {
        String a = "A";
        String b = "B";
        System.out.println(a.compareTo(b));
}
```
답 : -1  

기본 정렬 시 "A" 가 "B" 앞 이기 때문에 음 수


```java
    public static void main(String[] args) {
        String a1 = "a";
        String a2 = "A";
        System.out.println(a1.compareTo(a2)); // 32
        System.out.println(a2.compareTo(a1)); // -32
    }
```


```java
 public static void main(String[] args) {
        String A = "A";
        String z = "z";
        System.out.println(A.compareTo(z)); // -57
        System.out.println(z.compareTo(A)); // 57
    }
```
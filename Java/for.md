# 확장 for문

자바 공부하는데 처음 보는 문법이 있어서 공부해보았다. for(String 변수명: 배열) 이런 식으로 for 문이 되어있었다. 확장 for 문이라고 하며 for(타입 변수명: 반복될 것) 이런 형태로 되어있고 반복될 것이 변수명에 차례대로 들어가는 문법이다. 

<br>

## 예시

```java
public class test {
    public static void main(String[] args) {
        String[] arr = {"t", "e", "s", "t"};

        for(String str: arr){
            System.out.println(str);
        }

    }
}
```

<br>

## 결과

```java
t
e
s
t
```


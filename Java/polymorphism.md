# 다형성과 참조변수의 형변환

- 다형성
- 참조변수의 형 변환

<br>

## ✅ 다형성

조상 클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조할 수 있는 것이다.

<br>

## ✅ 참조변수의 형 변환

- 사용할 수 있는 멤버의 개수를 조절하는 것이다.

- 상속 관계에 있는 클래스 사이만 형 변환할 수 있다.

- 기본형처럼 값이 달라지는 것이 아니야.(int)3.6 -> 3 처럼...

<br>

```java
public class EX7_7 {
  public static void main(String[] args) {

    Car car = null;
    FireEngine fe = new FireEngine();
    FireEngine fe2 = null;

    fe.water();
    car = fe;
    fe2 = (FireEngine) car;
    fe2.water();

    // ClassCastException 에러남
//    Car c = new Car();
//    FireEngine fe3 = (FireEngine) c;
//    fe3.water();
  }
}

class Car{
  String color;
  int door;

  void drive(){
    System.out.println("drive~~~");
  }

  void stop(){
    System.out.println("stop");
  }
}

class FireEngine extends Car{
  void water(){
    System.out.println("water~~~");
  }
}
```






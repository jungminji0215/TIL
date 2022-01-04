# 인터페이스

추상 메서드 집합

인터페이스의 모든 메서드의 접근제어자는 public이다.

다중 상속이 가능하다. (조상이 여러 개 일 수 있음 )

<br>

## 추상 클래스 vs 인터페이스

추상클래스는 추상 메서드를 가지고 있는 클래스 (생성자도 있고, 멤버변수도 가질 수 있다.)

인터페이스는 오직 추상메서드만 가지고 있는 클래스

<br>

## 인터페이스 예제

```java
// 추상클래스
abstract class Unit{
    int x,y;
    abstract void move(int x, int y);
    void stop(){
        System.out.println("멈춥니다.");
    }
}

// 인터페이스
interface Fightable{
    void move(int x, int y);
    void attack(Fightable f);
}

class Fighter extends Unit implements Fightable{
    // 오버라이딩 규칙: 조상보다 접근제어자가 좁으면 안 된다. public 꼭 써주기
    public void move(int x, int y){
        System.out.println(x + "," + y + "이동");
    }

    public void attack(Fightable f){
        System.out.println(f + "공격");
    }
}

public class FighterTest {
    public static void main(String[] args) {
        Fightable f = new Fighter();
        // 밑에 두 개 가능! 조상의 참조변수가 자손의 인스턴스 참조할 수 있으니까
        //Fighter f = new Fighter();
        // Unit f = new Fighter();  -> attack 없어서 호출불가
        
        f.move(100, 200);
        f.attack(new Fighter());
    }
}
```

<br>

<br>

[자바의 정석](https://www.youtube.com/watch?v=EnBLkMYt1XQ&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=90)
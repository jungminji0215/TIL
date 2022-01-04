# 추상 클래스와 추상 메서드

- 추상클래스
- 추상메서드

<br>

## 추상 클래스와 추상 메서드란?

추상 클래스는 미완성 설계도이다. 선언 부만 있고 구현 부는 작성이 되지 않은 메서드가 있는 클래스를 추상 클래스라고 한다. 그럼 미완성 메서드는 어떻게 쓰이는 것일까? 바로 상속을 통해서 자손 클래스에서 구현 부를 완성하면 된다. 그냥 처음부터 메서드를 완성한 채로 클래스를 만들지 않는 이유는 무엇일까? 이는 새로운 클래스를 작성할 때 기반이 될 수 있기 때문이다. 메서드의 내용이 상속받는 클래스에 따라서 달라질 수 있는 경우 추상 클래스를 만들면 된다. 

```java
class Student1{
    private int math;
    private int english;

    void Score(int math, int english){
        int score = math + english;
        System.out.println("Student1의 총합은 " + score);
    }
}

class Student2{
    private int math;
    private int english;

    void Score(int math, int english){
        int score = math + english;
        System.out.println("Student2의 총합은 " + score);
    }
}

public class abstractEx {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        Student2 student2 = new Student2();
        
        student1.Score(50,80);
        student2.Score(100,70);
    }
}
```

위의 코드는 추상 클래스를 사용하지 않은 코드이다. 위를 추상 클래스를 사용하여 바꾸어 보자.

<br>

```java
abstract class Student{
    private int math;
    private int english;

    abstract void Score(int math, int english);
}

class Student1 extends Student{

    void Score(int math, int english){
        int score = math + english;
        System.out.println("Student1의 총합은 " + score);
    }
}

class Student2 extends Student{

    void Score(int math, int english){
        int score = math + english;
        System.out.println("Student2의 총합은 " + score);
    }
}

public class abstractEx {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        Student2 student2 = new Student2();
        
        student1.Score(50,80);
        student2.Score(100,70);
    }
}
```

(잘 만든 예시는 아니다) Student라는 추상 클래스를 만들고 Student1과 Student2가 Student를 상속받아서 사용하고 있다. 이렇게 추상 클래스를 사용함으로써 앞의 코드보다 중복된 코드를 없앨 수 있는 것이다. 
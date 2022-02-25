```java
public class DIEX01 {
    public static void main(String[] args) {
        
    }
    
    public static void memberUse1(){
        // 강한 결합 : 개발자가 객체 직접 생성
        Member m1 = new Member();
    }
    
    public static void memberUse2(Member m){
        // 약한 결합 : 스프링 컨테이너에 있는 것을 주입 받음
        Member m2 = m;
    }
}

class Member{
    String name;
}
```
스프링 DI 간단한 예시를 학습해 보았다.

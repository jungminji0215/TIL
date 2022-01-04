# 다형성과 참조변수의 형변환

- 다형성
- 참조변수의 형 변환

<br>

## ✅ 다형성

조상 클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조할 수 있는 것이다.

<br>

### 장점

- 다형적 매개변수가 가능하다. (매개변수의 다형성)
- 하나의 배열로 여러 객체 다룰 수 있다. (여러 종류의 객체를 배열로 다루기)

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

<br>

## ✅ 매개변수의 다형성

참조형 매개변수는 메서드 호출시, 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있다.

<br>

```java
// 다형성
// 매개변수의 다형성 예제

public class polymorphism {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        // 주석과 buyer.buy(new Tv()) 이 코드는 같은 의미이다.
        // Product product = new Tv();
        // buyer.buy(product); 
        buyer.buy(new Tv()); 
        System.out.println("남은 돈: " + buyer.money);

        buyer.buy(new Computer());
        System.out.println("남은 돈: " + buyer.money);

    }
}

class Product{
    int price;

    // 생성자
    Product(int price){
        this.price = price;
    }
}

class Tv extends Product{
    Tv(){
        super(100);
    }

    // Object 클래스의 toString() 오버라이딩
    public String toString(){
        return "Tv";
    }
}

class Computer extends Product{
    Computer(){
        super(200);
    }

    public String toString(){
        return "Computer";
    }
}

class Buyer{
    int money = 1000;

    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액 부족");
            return;
        }

        money -= p.price;
        System.out.println(p + " 구매 완료!");
    }
}
```

```shell
Tv 구매 완료!
남은 돈: 900
Computer 구매 완료!
남은 돈: 700
```

Buyer 클래스에서 buy 메서드의 참조형 매개변수가 Product 타입이므로 Product의 자손 클래스인 Tv, Computer 인스턴스를 모두 넘겨받을 수 있다. 만약 참조형 매개변수로 Product 타입을 쓰지 않았다면 Tv, Computer 각각을 넘겨받을 수 있게 아래와 같이 메서드 오버라이딩을 해야 한다. 이는 중복된 코드가 많아서 비효율적이다.

<br>

```java
void buy(Tv tv){
    if(money < tv.price){
        System.out.println("잔액 부족");
        return;
    }

    money -= tv.price;
    System.out.println(tv + " 구매 완료!");
}

void buy(Computer computer){
    if(money < computer.price){
        System.out.println("잔액 부족");
        return;
    }

    money -= computer.price;
    System.out.println(computer + " 구매 완료!");
}
```

<br>

## ✅ 여러 종류의 객체를 배열로 다루기

```java
// 다형성
// 매개변수의 다형성 예제

public class polymorphism {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        // 주석과 buyer.buy(new Tv()) 이 코드는 같은 의미이다.
        // Product product = new Tv();
        // buyer.buy(product);
        buyer.buy(new Tv());
        System.out.println("남은 돈: " + buyer.money);

        buyer.buy(new Computer());

        buyer.cart();
    }
}

class Product{
    int price;

    // 생성자
    Product(int price){
        this.price = price;
    }
}

class Tv extends Product{
    Tv(){
        super(100);
    }

    // Object 클래스의 toString() 오버라이딩
    public String toString(){
        return "Tv";
    }
}

class Computer extends Product{
    Computer(){
        super(200);
    }

    public String toString(){
        return "Computer";
    }
}

class Buyer{
    int money = 1000;
    int i = 0;
    Product [] cart = new Product[10];

    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액 부족");
            return;
        }

        money -= p.price;
        cart[i++] = p;
        System.out.println(p + " 구매 완료!");
    }

    void cart(){
        for(int i = 0; i < cart.length; i++){
            if(cart[i] == null){
                break;
            }
            System.out.println("cart: " + cart[i]);
        }
    }
}
```

Product 타입의 cart 객체 배열에 Product의 자손인 Tv와 Computer를 담을 수 있다. 




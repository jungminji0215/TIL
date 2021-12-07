

# JPA Dialect

JPA는 내가 MySQL을 사용하면 MySQL에 맞는 문법과 함수가 사용되고 Oracle을 사용하면 Oracle에 맞는 문법과 함수가 사용된다. 이게 어떻게 가능할 것인가.    

JPA는 특정 데이터베이스에서만 사용 가능한 것이 아니다. 따라서 데이터베이스마다 제공하는 SQL 문법과 함수가 조금씩 달라도 JPA에서 제공하는 Dialect 기능을 사용하면 사용하는 데이터베이스에 맞게 JPA를 사용할 수 있다.   

persistence.xml은 JPA설정 파일이다. 여기서 설정을 하면 된다.

<br>

## persistence.xml 설정

```xml
<property name="hibernate.dialect" value="org.hibernate.dialect.H2Dialect"/>
```

위의 설정이 내가 사용하는 데이터베이스에 맞춰주라고 JPA에게 알려주는 것이다.

(JPA야 나는 H2 데이터베이스 쓸 거야. 그러니 너가 알아서 그거에 맞게 문법이나 함수 등등 알아서 해줘! )
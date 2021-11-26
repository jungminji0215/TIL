# SQL을 사용해보자.

- 테이블 구조
- SQL 사용

<br>

## ✅ 테이블 구조

![1](img/SQL/1-16379028696022.jpg)

- 열 : 데이터의 타입, 데이터의 구조
- 행 : 데이터 하나

<br>

## ✅ SQL (Structured Query Language)  

SQL은 MySQL Server에게 소통하는 언어이다.

<br>

## ✅ SQL 사용

### 테이블 생성

```mysql
CREATE TABLE topic(
    id INT(11) NOT NULL AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    description TEXT NULL,
    created DATETIME NOT NULL,
    author VARCHAR(30) NULL,
    profile VARCHAR(100) NULL,
    PRIMARY KEY(id));
```

id INT(11) 👉  숫자 검색 같은 것 할 때 얼마까지만 노출할 것이냐를 정하는 것  

<br>

### 테이블 정보 보기

```mysql
desc [테이블 이름];
```

```mysql
desc topic;
```

![image-20211126071038049](img/SQL/image-20211126071038049.png)


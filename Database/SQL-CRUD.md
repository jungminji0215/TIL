# SQL CRUD

- create
- read
- update
- delete

<br>

## ✅ CREATE

```mysql
INSERT INTO table_name (column1, column2, column3, ...)
VALUES (value1, value2, value3, ...);
```

```mysql
INSERT INTO topic (title, description, created, author, profile) 
VALUES ("MySQL", "MySQL is ...", NOW(), "minji", "developer");
```

<br>

## ✅ READ

```mysql
SELECT column1, column2, ... FROM table_name;
```

```mysql
select * from topic;
```

<br>

![image-20211126071959065](img/SQL-CRUD/image-20211126071959065.png)

<br>

## ✅ UPDATE

```mysql
UPDATE table_name
SET column1 = value1, column2 = value2, ...
WHERE condition;
```

```mysql
UPDATE topic SET description="PostgreSQL is ..." WHERE id = 2;
```

<br>

![image-20211126134451391](img/SQL-CRUD/image-20211126134451391.png)

![image-20211126134326334](img/SQL-CRUD/image-20211126134326334.png)

<br>

## ✅ DELETE

```mysql
DELETE FROM table_name WHERE condition;
```

```mysql
DELETE FROM topic WHERE id=2;
```

<br>

![image-20211126134715093](img/SQL-CRUD/image-20211126134715093.png)
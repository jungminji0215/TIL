# HTTP

- 프로토콜
- HTTP

<br>

## 프로토콜

프로토콜이란 설간의 통신을 위한 약속, 규칙이다. 

즉, 주고받을 데이터에 대한 형식을 정의한 것이다.

<br>

## 개발자 도구

![image-20211202162619975](C:\Users\jmj\AppData\Roaming\Typora\typora-user-images\image-20211202162619975.png)

개발자 도구의 network탭을 통해서 web browser와 web server가 통신하는 내용을 볼 수 있다. 

<br>

## Request Headers - 요청

![image-20211202162911343](C:\Users\jmj\AppData\Roaming\Typora\typora-user-images\image-20211202162911343.png)

web 브라우저가 웹서버에게 요청한 데이터이다. 

![image-20211202163146134](C:\Users\jmj\AppData\Roaming\Typora\typora-user-images\image-20211202163146134.png)

view source 눌러서 나오는 위에 두줄이 필수적인 정보이다.

```shell
GET /auth/loginForm HTTP/1.1
Host: localhost:8000
Connection: keep-alive
sec-ch-ua: " Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96"
sec-ch-ua-mobile: ?0
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36
sec-ch-ua-platform: "Windows"
Accept: image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8
Sec-Fetch-Site: same-origin
Sec-Fetch-Mode: no-cors
Sec-Fetch-Dest: image
Referer: http://localhost:8000/
Accept-Encoding: gzip, deflate, br
Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7
Cookie: JSESSIONID=575BC995DAA61900D8E2F67E84993C54
```

```
GET /auth/loginForm HTTP/1.1
```

요청 행(Request Line)

```
Host: localhost:8000
```

request header

```
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36
```

웹브라우저의 다른이름

<br>

## Response Headers

![image-20211202162944066](C:\Users\jmj\AppData\Roaming\Typora\typora-user-images\image-20211202162944066.png)








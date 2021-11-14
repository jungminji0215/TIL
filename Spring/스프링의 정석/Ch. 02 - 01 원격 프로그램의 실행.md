![https://blog.kakaocdn.net/dn/sSRdw/btrkC7ZsOSK/uAq7qw8Kh9GoNrGQb40h30/img.png](https://blog.kakaocdn.net/dn/sSRdw/btrkC7ZsOSK/uAq7qw8Kh9GoNrGQb40h30/img.png)
<br><br>
### ✔ Hello.java

```java
package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	int iv = 10;
	static int cv = 20;

	@RequestMapping("/hello")
	private void main() {
		System.out.println("안녕!!!!");
		System.out.println(cv);
		System.out.println(iv);
	}

	public static void main2() {
		System.out.println(cv);
	}
}
```
<br><br>
### ✔ PrivateMethodCall.java

```java
package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {
	public static void main(String[] args) throws Exception {
//Hello hello = new Hello();//hello.main();//private여서 외부 호출 불가

		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		Hello hello = (Hello)helloClass.newInstance();
		Method main = helloClass.getDeclaredMethod("main");
		main.setAccessible(true);
		main.invoke(hello);
	}
}
```
Java Application으로 실행

<br><br>
---

> [스프링의 정석] 강의를 듣고 이해한 내용을 스스로 정리한 것입니다.
> 
> 
> [스프링의 정석 : 남궁성과 끝까지 간다 | 패스트캠퍼스](https://fastcampus.co.kr/dev_academy_nks)
>

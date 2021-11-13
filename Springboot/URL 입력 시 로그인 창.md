## ✅ 문제점

![https://blog.kakaocdn.net/dn/kX9ok/btrkpPGwrbl/nCsghcbU68ctXxHGqDEph0/img.png](https://blog.kakaocdn.net/dn/kX9ok/btrkpPGwrbl/nCsghcbU68ctXxHGqDEph0/img.png)

환경설정 마치고 프로젝트가 잘 동작하는지 확인하기 위해서 Controller 만들고 브라우저에 URL을 입력했더니 원하는 결과 창은 안 나오고 갑자기 로그인 화면이 나왔다.
<br><br>
## ✅ 원인

spring 보안 인증으로 인해서 기본 로그인 화면이 redirect 된다고 한다.
<br><br>
## ✅ 해결 방법

username에는 'user'

password에는 스프링부트 프로젝트 실행하면 콘솔 창에서 확인 가능하다.

![https://blog.kakaocdn.net/dn/IVghG/btrkqtbObh9/fry8qdxyrYfSdSrFrxjDU0/img.png](https://blog.kakaocdn.net/dn/IVghG/btrkqtbObh9/fry8qdxyrYfSdSrFrxjDU0/img.png)

빨간색 부분을 확인하면 된다.
<br><br>
## ✅ 결과

![https://blog.kakaocdn.net/dn/cCRI9A/btrku1yG2Jq/CIOeO5uhAIYPMjmVTZ1lL0/img.png](https://blog.kakaocdn.net/dn/cCRI9A/btrku1yG2Jq/CIOeO5uhAIYPMjmVTZ1lL0/img.png)

결과가 잘 나온다!

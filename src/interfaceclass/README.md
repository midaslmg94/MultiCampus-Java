### 인터페이스
인터페이스는 객체로 생성할 수 없다 = 생성자가 없다.

interface 인터페이스이름 {

	// 상수 필드 ← 인스턴스 필드 또는 정적 필드는 선언 불가
	데이터타입 상수이름 = 상수값;
	
	// 추상 메소드
	데이터타입 메소드이름 (매개변수, … );
}

상수필드 선언
`public static final [데이터 타입] [상수이름] = 값;`

상수이름은 대문자로 작성하는게 좋음. 여러 문자로 구성되는 경우, _ 로 연결

```java
public interface RemoteControl{
    public static final MAX_VOLUME = 10;
    public static final MIN_VOLUME = 0;
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);
}
```


### 구현 클래스
인터페이스에서 정의된 추상 메소드를 재정의해서 실행 내용을 가지고 있는 클래스

```java
public class [구현클래스이름] implements [인터페이스 이름]{
    // 인터페이스에서 선언한 추상 메서드 재정의
    
}

public class TvRemoteControl implements RemoteControl{
    public void turnOn(){
    
    }
    public void turnOff(){
        
    }
}
```

### 다중 상속
인터페이스는 다중 상속이 가능하다.
```java
public class CLASS_NAME implements INTERFACE_01, INTERFACE_02 { 
    // 인터페이스 01에 정의된 메소드를 재정의
    // 인터페이스 02에 정의된 메소드를 재정의                           
}
```


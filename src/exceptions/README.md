### 실행예외 
#### 컴파일한 시점에 알 수 없다. 실행시점에 결정되는 값으로 인해 발생하는 예외 

- `ArithmeticException` : 0으로 나누기와 같은 부적절한 산술연산
- `IllegalArgumentException` : 메서드에 부적절한 인수를 전달할 때 발생
- `IndexOutofBuondsException` : 배열, 벡터등의 범위를 벗어난 인덱스 사용할 때 발생
- `NoSuchElementException` : 요구한 원소가 없을 때 발생할 때 발생
- `NullPointerException` : null 값을 가진 참조 변수에 접근할 때 발생
- `NumberFormeatException` : 숫자로 바꿀 수 없는 문자열을 숫자로 변환할 때 발생



### 일반예외 

#### 컴파일 시점에 알 수 있다. 개발자가 예외 처리 코드를 반드시 추가해야 한다.

- `ClassNotFoundException` : 존재하지 않는 클래스를 사용할 때 발생
- `InterruptedException` : 인터럽트되었을 때 발생
- `NoSuchFieldException` : 클래스가 명시한 필드를 포함하지 않을 때 발생
- `NoSuchMethodException` : 클래스가 명시한 메서드를 포함하지 않을 때 발생
- `IOException` : 데이터 읽기 같은 입출력 문제가 있을 때 발생



### 예외처리 

#### 예외를 잡아서 처리 : try-catch-finally 구문
```java
try{
 // 예외 발생 예상 구문
}catch(예외){
    // 예외 처리
 }finally{
    // 예외 발생 여부와 관계 없이 수행해야 할 코드 
}
```
#### try-with-resource 구문(JDK 7)
```java
try(자원생성){
 // 자원 사용
}catch(예외){
    // 예외 처리
}
```


#### 예외를 떠넘기는 방법 : throws 
메서드에서 발생한 예외를 메소드 내부에서 처리하기 부담스러울 경우 throws를 사용해서 상위 코드로 예외를 전달하는 방법

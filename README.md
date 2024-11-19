# Java brush up project

---
 
> Java 기초 문법에 대해 ChatGPT를 활용해서 리마인드 하기위한 프로젝트입니다.

## Index

1. **자바 기본 문법**
2. **객체 지향 프로그래밍 (OOP)**
3. **실무 적용 예제: 주문 관리 시스템**
4. **자바의 예외 처리란?**
5. **예외 처리 기본 문법**
6. **실무 적용 예제: 예외 처리**
7. **사용자 정의 예외**
8. **자바 컬렉션 프레임워크란?**
9. **주요 인터페이스와 클래스**
10. **실무 적용 예제: 학생 관리 시스템**

---

## **1. 자바 기본 문법**

---

### **자바의 주요 특징**

- **플랫폼 독립성**: JVM(Java Virtual Machine) 덕분에 다양한 운영체제에서 실행 가능
- **객체 지향 언어**: 코드의 재사용성과 유지보수성이 뛰어남
- **강타입 언어**: 데이터 타입을 엄격히 준수

---

### **1.1 기본 문법**

### **변수와 데이터 타입**

변수는 데이터를 저장하기 위해 메모리에 이름을 붙이는 것입니다.

자바는 기본적으로 두 가지 타입의 데이터를 사용합니다.

- **기본형(Primitive types)**: `int`, `double`, `boolean`, `char` 등
- **참조형(Reference types)**: 클래스, 배열, 인터페이스 등
- [Sample code](https://github.com/dev-jhjoo/java-brushup/blob/master/src/BasicSyntax.java)

### **제어문**

자바는 `if`, `for`, `while`, `switch` 같은 제어문으로 코드의 흐름을 제어합니다.
- [Sample code](https://github.com/dev-jhjoo/java-brushup/blob/master/src/ControlStatements.java)


## **2. 객체 지향 프로그래밍 (OOP)**

---

### **OOP의 주요 특징**

1. **캡슐화(Encapsulation)**: 데이터를 외부로부터 보호하고, 메서드를 통해 접근
2. **상속(Inheritance)**: 기존 클래스의 기능을 확장
3. **다형성(Polymorphism)**: 하나의 메서드나 객체가 여러 형태를 가질 수 있음
4. **추상화(Abstraction)**: 불필요한 세부 사항을 숨기고 중요한 것에 집중

---

### **2.1 클래스와 객체**

클래스는 객체를 생성하기 위한 설계도입니다. 객체는 클래스에서 생성된 실체입니다.

- [Sample code](https://github.com/dev-jhjoo/java-brushup/blob/master/src/Person.java)

### **2.2 상속과 다형성**

상속은 코드 재사용성을 높여주고, 다형성은 유연한 코드 작성을 가능하게 합니다.

- [Sample code](https://github.com/dev-jhjoo/java-brushup/blob/master/src/PolymorphismExample.java)


## **3. 실무 적용 예제: 주문 관리 시스템**

---

간단한 주문 관리를 위한 객체 지향 설계 예제입니다.

### **요구사항**

- 고객은 상품을 주문할 수 있다.
- 주문 정보에는 고객 정보와 상품 정보가 포함된다.
- 주문 정보를 출력하는 기능이 필요하다.
- [Sample code](https://github.com/dev-jhjoo/java-brushup/blob/master/src/Transaction.java)


## **4. 자바의 예외 처리란?**

### **예외(Exception)란?**

- **정의**: 프로그램 실행 중에 발생하는 비정상적인 상황
- **종류**:
    - **Checked Exception**: 컴파일 시점에 반드시 처리해야 하는 예외
      (예: `IOException`, `SQLException`)
    - **Unchecked Exception**: 런타임 시 발생하는 예외
      (예: `NullPointerException`, `ArrayIndexOutOfBoundsException`)

### **자바의 예외 처리 방법**

자바는 예외 처리를 위해 `try-catch-finally` 블록을 제공합니다.

---

## **5. 예외 처리 기본 문법**

### **5.1 try-catch 블록**

예외가 발생할 수 있는 코드를 `try` 블록에 작성하고, 발생한 예외를 `catch` 블록에서 처리합니다.

- [Sample code](https://github.com/dev-jhjoo/java-brushup/blob/master/src/ExceptionExample.java)

### **5.2 finally 블록**

`finally` 블록은 예외 발생 여부와 상관없이 항상 실행됩니다.

- [Sample code](https://github.com/dev-jhjoo/java-brushup/blob/master/src/FinallyExample.java)


### **5.3 throw와 throws**

- **`throw`**: 예외를 직접 발생시킬 때 사용
- **`throws`**: 메서드가 예외를 던질 가능성을 명시
- [Sample code](https://github.com/dev-jhjoo/java-brushup/blob/master/src/ThrowThrowsExample.java)


## **6. 실무 적용 예제**

### **요구사항**

1. 사용자 입력에서 숫자가 아닌 값을 입력하면 프로그램이 종료되지 않고 적절한 메시지를 출력해야 함.
2. 데이터베이스 연결 시, 실패할 경우 사용자에게 연결 실패 메시지를 출력.

---

### **6.1 사용자 입력 예외 처리**

- [Sample code](https://github.com/dev-jhjoo/java-brushup/blob/master/src/InputValidationExample.java)

---

### **6.2 데이터베이스 연결 예외 처리**

- [Sample code](https://github.com/dev-jhjoo/java-brushup/blob/master/src/DatabaseConnectinExample.java)


---

## **7. 사용자 정의 예외**

실무에서는 특정 비즈니스 로직에 대한 예외를 사용자 정의 예외로 처리할 수 있습니다.

### **예제: 주문 금액이 0 이하일 때 예외 발생**

- [Sample code](https://github.com/dev-jhjoo/java-brushup/blob/master/src/CustomExceptionExcample.java)



## **8. 자바 컬렉션 프레임워크란?**

### **정의**

자바 컬렉션 프레임워크(Java Collections Framework, JCF)는 데이터를 효율적으로 저장하고 관리하기 위해 제공되는 클래스와 인터페이스의 집합입니다.

### **주요 특징**

- **데이터 구조 구현**: 리스트, 스택, 큐, 집합 등 다양한 자료구조 제공
- **표준화**: 일관된 API를 제공
- **유연성**: 다양한 데이터 타입과 크기를 동적으로 처리 가능
- **알고리즘 제공**: 정렬, 검색, 순회 등 기본적인 알고리즘 내장

---

## **9. 주요 인터페이스와 클래스**

### **9.1 주요 인터페이스**

1. **List**: 순서가 있는 데이터의 집합 (중복 허용)
    - 주요 구현 클래스: `ArrayList`, `LinkedList`
2. **Set**: 중복을 허용하지 않는 데이터의 집합
    - 주요 구현 클래스: `HashSet`, `TreeSet`
3. **Queue**: FIFO(First In First Out) 구조의 데이터 집합
    - 주요 구현 클래스: `PriorityQueue`, `LinkedList`
4. **Map**: 키-값 쌍으로 데이터를 저장 (키는 중복 불가)
    - 주요 구현 클래스: `HashMap`, `TreeMap`

---

### **9.2 주요 클래스**

### **9.2.1 ArrayList**

배열 기반의 리스트로, 크기를 동적으로 조정 가능하며 순차적인 데이터 접근에 최적화되어 있습니다.

- [Sample code](https://github.com/dev-jhjoo/java-brushup/blob/master/src/ArrayListExample.java)

---

### **9.2.2 HashSet**

중복을 허용하지 않으며 순서가 없는 데이터 구조입니다.

내부적으로 `HashMap`을 사용하여 빠른 검색과 삽입을 지원합니다.

- [Sample code](https://github.com/dev-jhjoo/java-brushup/blob/master/src/HashSetExample.java)

---

### **2.2.3 HashMap**

키-값 쌍으로 데이터를 저장하며, 키의 중복을 허용하지 않습니다.

- [Sampe code](https://github.com/dev-jhjoo/java-brushup/blob/master/src/HashMapExample.java)

---

### **2.2.4 PriorityQueue**

우선순위에 따라 데이터를 정렬하며, 기본적으로 최소값이 가장 먼저 출력됩니다.

- [Sample code](https://github.com/dev-jhjoo/java-brushup/blob/master/src/PriorityQueueExample.java)

---

## **10. 실무 적용 예제: 학생 관리 시스템**

### **요구사항**

1. 학생의 이름과 점수를 저장
2. 점수를 기준으로 정렬
3. 특정 점수 이상의 학생 목록 출력

### **코드 구현**

- [Sample code](https://github.com/dev-jhjoo/java-brushup/blob/master/src/StudentManagement.java)



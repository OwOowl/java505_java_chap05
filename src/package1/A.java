package package1;

public class A {
//    protected : 다른 패키지의 경우 자식 클래스만 사용 가능
    protected String value;

    protected A() {
        System.out.println("A 클래스의 생성자 실행");
    }

    protected void method() {
        System.out.println("A 클래스의 method() 실행");
    }
}

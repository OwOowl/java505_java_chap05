package package2;

import package1.A;
public class C {
    public void method() {
//        A클래스는 접근제한자가 public으로 설정 되어 A클래스 타입의 변수는 생성 할 수 있음
        A a;
//        A클래스의 생성자에 접근 제한자가 protected로 설정되어 생성자가 접근 할 수 없음
//        A a = new A();
//        A클래스의 멤버 변수에 접근 제한자가 protected로 설정되어 멤버 변수에 접근 할 수 없음
//        a.value = "value";
//        A클래스의 멤버 메서드에 접근 제한자가 protected로 설정되어 멤버 메서드에 접근 할 수 없음
//        a.method();
    }
}

package package1;

public class B {
    public void method() {
//        동일한 패키지 내에서는 public이나 protected, default나 거의 같음
        A a = new A();
        a.value = "value";
        a.method();
    }
}

public class ChildEx {
    public static void main(String[] args) {
//        Child child = new Child();

//        Parent parent = child;
//        parent.method1();
//        parent.method2();


        Parent parent = new Parent();
        parent.method1();
        parent.method2();

        Child child = new Child();
        child.method1();
        child.method2();
        child.method3();

//        다형성 : 부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입하여 부모 클래스 타입의 객체인것처럼 사용
//                실제 결과물은 자식 클래스 타입의 객체가 가지고 있는 데이터로 출력
//                단, 부모 클래스 타입의 객체가 가지고 있지 못한 자식 클래스 타입의 멤버는 사용 불가
        parent = child;
        parent.method1();
        parent.method2();
//        parent.method3();
    }
}

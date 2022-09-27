import package1.B;

public class Main {
    public static void main(String[] args) {

//        상속 2022-09-27
        System.out.println("----- 상속 -----");

        Point p = new Point();

        p.set(1,2);
        p.showPoint();


        ColorPoint cp = new ColorPoint();

//        Point 클래스를 ColorPoint에 상속하여 ColorPoint에서 Point의 모든 멤버 사용 가능
        cp.set(3,4);
        cp.setColor("red");
        cp.showColorPoint();






//        문제 1) 클래스 SumSub와 MultiDiv를 생성하고 SumSub에는 멤버 변수 num1, num2를 가지고 멤버 메서드 sum(), sub()를 가지도록
//               하며, MultiDiv에는 멤버 변수 result, 멤버 메서드 multi(), div()를 가지도록 하rh, Calculator 클래스를 생성하여
//               두 개의 클래스를 상속받아 모든 기능을 사용 할 수 있는 클래스를 작성하고 각각 사칙연산을 수행하시오
//               Calaulator 클래스는 나머지 연산을 위한 메서드 other() 생성
        Calculator cal = new Calculator();

        cal.num1 = 20;
        cal.num2 = 3;

        cal.result = cal.sum();
        System.out.println("두 수의 덧셈 : " + cal.sum());
        cal.result = cal.sub();
        System.out.println("두 수의 뺄셈 : " + cal.sub());
        cal.result = cal.multi();
        System.out.println("두 수의 곱셈 : " + cal.multi());
        cal.result = cal.div();
        System.out.println("두 수의 나눗셈 : " + cal.div());
        cal.result = cal.other();
        System.out.println("두 수를 나눈 나머지 : " + cal.other());








        DmbCellphone dmbCellphone = new DmbCellphone("자바폰", "검정", 10);

        System.out.println("모델 : " + dmbCellphone.model);
        System.out.println("색상 : " + dmbCellphone.color);
        System.out.println("채널 : " + dmbCellphone.channel);

        dmbCellphone.powerOn();
        dmbCellphone.bell();
        dmbCellphone.sendVoice("여보세요");
        dmbCellphone.receiveVoice("안녕하세요 저는 홍길동인데요");
        dmbCellphone.sendVoice("아~ 예 반갑습니다.");
        dmbCellphone.hangUp();

        dmbCellphone.turnOnDmb();
        dmbCellphone.changeChannelDmb(12);
        dmbCellphone.turnOffDmb();

        Student std = new Student("홍길동", "123456-1234567", 1);












//        override
        int r = 10;

        Calculator1 calculator1 = new Calculator1();
        System.out.println("원면적 : " + calculator1.areaCircle(r));
        System.out.println(calculator1.sum());
        System.out.println(calculator1.sub());
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원면적 : " + computer.areaCircle(r));
        System.out.println(computer.sum());
        System.out.println(computer.sub());




        System.out.println();

        SupersonicAirplaneEx supersonicAirplaneEx = new SupersonicAirplaneEx();
        supersonicAirplaneEx.execute();
        Math.random();





//        protected 접근 제한자

        B b = new B();








    }
}
public class SportsCar extends Car{
    public final String sound = "빵빵";



    @Override
    public void speedUp() {
        speed += 10;
//        멤버 변수인 sound에 final이 사용되고 있어 수정 불가
//        sound = "빵~~";
    }


//    부모 클래스 멤버 메서드인 stop()이 final이 사용되고 있어서 오버라이드 금지
//    @Override
//    public void stop() {
//        System.out.println("차를 멈춤");
//        speed = 0;
//    }
}

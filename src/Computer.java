public class Computer extends Calculator1{
    @Override       // 재정의
    double areaCircle(double r) {       // 부모 클래스와 같아야 하는 부분
        System.out.println("Coumputer 객체의 areaCircle() 실행");    // 내용은 변경 가능
        System.out.println("수정된 내용");
        return Math.PI * r * r;
    }

    @Override
    int sum() {
        System.out.println("오버라이딩하여 출력하기 : " + (20 + 10));
        return 20 + 10;
    }


    int sub(int num1, int num2) {   // 오버라이딩 하지 않으면 부모 클래스와 이름이 같은 개별 생성자
        System.out.println("오버라이딩하여 출력하기 : " + (10 - 3));
        return 10 - 3;
    }
}

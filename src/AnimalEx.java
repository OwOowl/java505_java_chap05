public class AnimalEx {
    public static void animalSound(Animal animal) {
        animal.sound();
    }
    public static void main(String[] args) {
        Dog dog = new Dog("강아지");
        Cat cat = new Cat("고양이");

        dog.breath();
        cat.breath();
        dog.sound();
        cat.sound();
        System.out.println("------------------");

//        추상 클래스 타입의 변수 선언하는 것은 문제가 없음
//        클래스의 형변환
        Animal animal;
        animal = new Dog("멍멍이");
        animal.sound();

        animal = new Cat("고양이");
        animal.sound();

        animalSound(new Dog("멍멍이"));
        animalSound(new Cat("고양이"));
    }
}

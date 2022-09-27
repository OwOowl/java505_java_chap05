public class Student extends People{
    public int studentNo;

    public Student(String name, String ssn, int studentNo) {
        super(name, ssn);    // 부모클래스 생성자 호출하는 명령어. 무조건 첫 번째 줄에  있어야 함.
        this.name = name;
        this.ssn = ssn;
        this.studentNo = studentNo;
    }
}

public class Tire {
    public int maxRotation; // 최대 회전수
    public int accumnulatedRotation; // 누적 회전수
    public String location; // 타이어 위치

    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll() {
        ++accumnulatedRotation;

        if (accumnulatedRotation < maxRotation) {
            System.out.println(location + "Tier 수명 : " + (maxRotation - accumnulatedRotation) + "회");
            return true;
        }
        else{
            System.out.println("*** " + location + " Tire 펑크 ***");
            return false;
        }
    }
}

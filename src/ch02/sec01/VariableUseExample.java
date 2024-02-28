package ch02.sec01;

// 파일명과 클래스의 이름은 같음! ★
// shift + F6
public class VariableUseExample {
    public static void main(String[] args) {
        int hours =3;
        int minute =5;
        System.out.println(hours + "시간 " + minute + "분");

        int totalMinute = (hours*60) + minute;
        System.out.println("총 " +  totalMinute + "분");
    }
}

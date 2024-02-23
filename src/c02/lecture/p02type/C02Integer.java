package c02.lecture.p02type;

public class C02Integer {
    public static void main(String[] args) {
        // 정수 타입 int
        int a = 5;
        int b = 10;
        b = 30;
        b = 30000000;
        b = -30000000;


        b = 2147483647; // int가 표현할 수 있는 값의 최대 범위임. 21억 얼마..
        b = 2_147_483_647; //  _는 세자리 마다 숫자 끊어 읽는 , 역할

        // long
        long c = 2_147_483_648L; // long 사용시 int 사용 범위 넘어 가면 뒤에 반드시 L 붙여야 한다.
        long d = 34556; // int 사용 범위 넘지 않는 애들은 안 붙여도 됨..

    }
}

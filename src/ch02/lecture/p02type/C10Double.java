package ch02.lecture.p02type;

import java.math.BigDecimal;

public class C10Double {
    public static void main(String[] args) {

        // double은 근사 값으로 저장됨
        double a = 0.1;
        double b = 0.2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        double c = a + b; // 0.3이 나올 거라 생각했는데
        System.out.println("c = " + c); // 결과 값은 c = 0.30000000000000004 출력됨..
        // 이렇게 연산시 원하지 않는 결과가 나올 수 있움

        // BigDecimal 사용해서 문제 해결
        BigDecimal d = new BigDecimal("0.1");
        BigDecimal e = new BigDecimal("0.2");

        BigDecimal f = d.add(e);
        System.out.println("f = " + f);

    }
}

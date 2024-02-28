package ch02.lecture.p02type;

public class C08Double {
    public static void main(String[] args) {
        // double 실수 표현 타입
        // 8byte = 64bits

        double a = 3.141592;
        double b = 23445.34444;
        double c = -9189.333445;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // 유한한 저장공간의 값을 저장한다. 근사한 값 저장
        double d = 23455.837589723895734758934;
        System.out.println("d = " + d); // d = 23455.837589723895


        /* 교재 47p
        FloatDoubleExample */
        // 정밀도 확인
        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2); //  double 타입이 float 타입보다 약 2배 정도의 유효 자릿수를 가진다.

        // 10의 거듭제곱 리터럴
        double var3 = 3e6;
        float var4 = 3e6F;
        double var5 = 2e-3;

        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);
    }
}

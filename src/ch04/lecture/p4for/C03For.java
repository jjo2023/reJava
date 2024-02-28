package ch04.lecture.p4for;

public class C03For {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i); // i변수 사용 가능
        }

        int i =0;
        for (; i<3; i++){
            System.out.println("i = " + i);
        }
        System.out.println("i = " + i);
    }
}

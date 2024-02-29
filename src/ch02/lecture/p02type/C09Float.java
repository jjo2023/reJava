package ch02.lecture.p02type;

public class C09Float {
    public static void main(String[] args) {
        // float 실수 표현 타입
        // 4byte 사용

        float a = 3.14F;
        // 실수를 그냥 쓰면 default가 double이기 때문에 8byte의 값을 가진다.
        // 따라서 4byte로 옮겨 담을 수 없기 때문에 오류가 남...
        // 뒤에 F(대소문자 구분 x) 붙여야 함.
        // 뭐..굳이 귀찮게 쓸일이 있을까 싶음...🙄
        float b = 9.99f;

        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}

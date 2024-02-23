package c02.lecture.p01variable;

public class C01Variable {
    public static void main(String[] args) {
        // 주석 : 실행 흐름에 영향을 주지 않는 줄
        // 한 줄 주석 ctrl + /
        /*
        여러 줄 주석
         */

        // 변수 (variable) : 값을 저장하는 공간의 이름
        // 변수 선언 : 저장 공간을 만듦
        // 타입명 변수명
        int a; // int 타입의 저장공간 마련, 공간의 이름은 a

        // 변수에 값 저장(assignment, 할당, 대입)
        // 변수명 = 값
        a = 10;
        System.out.println(a);
        a = 9; // a가 9로 바뀐 이후에는
        System.out.println(a); // 9가 나옴

        // 변수 b를 int 타입으로 선언하고
        int  b;
        // 변수 b에 100을 대입하고
        b=100;
        // 변수 b 출력
        System.out.println(b);

        // 변수명 작성 법칙 (법칙은...어기면 오류나)
        // 1. 영문 대소문자, 숫자, $, _
        // 2. 숫자로 시작할 수 없다.
        // 3. 같은 변수명을 다시 선언할 수 없음
        // 4. 자바의 키워드(=예약어)는 사용할 수 없음




        // 변수명 작성 관습
        // 1. 소문자로 시작
        // 2. 여러단어의 조합이면 각단어의 앞글자만 대문자
        // -> lowerCamelCase




    }
} 

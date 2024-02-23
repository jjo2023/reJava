package c02.lecture.p02type;

public class C07Character {
    public static void main(String[] args) {
        // char (character)
        // 2byte = 16bits
        // 0 ~ 65535, 문자 코드임, 수를 표현하기 위한 데이터 타입이 아니다.
        // unicode
        // ※ 빈 문자 '' 대입시 컴파일 에러 발생, 공백 하나는 가능함. ' '

        char a = 99; // 유니코드 소문자 c
        char b = 120; // 유니코드 소문자 x
        char c = 65535; // 유니코드

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        char d = 9883; // 유니코드
        char e = 10084; // 유니코드

        System.out.println("d = " + d);
        System.out.println("e = " + e);

        System.out.println("unicode 홈페이지 들어가서, 해당하는 문자의 16진수(코드)를 확인한뒤,");
        System.out.println("프로그래머 계산기에서 16진수를 10진수로 바꾼 값을 char에 넣으면 됨!");

        // 2바이트 이상인.. 이모지 문자를 넣는 방법이다.
        int o = 0x1f607;
        char [] emoji1 = Character.toChars(o);
        String emojis = new String(emoji1);
        System.out.println("emojis = " + emojis);

        // 1f403 염소모양 이모지 출력
        int p = 0x1f403; // 0x로 시작은 16진수라는 뜻!! 그리고 뒤에 넣고 싶은 코드 값임
        char [] goat1 = Character.toChars(p);
        String goat = new String(goat1);
        System.out.println("goat = " + goat);


        /* 교재 44p
        CharExample */
        char c1 = 'A'; // 문자 저장
        char c2 = 65; // 유니코드 직접 저장

        char c3 = '가'; // 문자 저장
        char c4 = 44032; // 유니코드 직접 저장

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}

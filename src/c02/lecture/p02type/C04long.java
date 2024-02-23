package c02.lecture.p02type;

public class C04long {
    public static void main(String[] args) {
        // long
        // 최소값, 최대값

        long a = 30_0000_0000L;
        // 인티저를 넘어가는 범위를 쓸때는 끝에 L! 소문자로 적어도 되긴하나 소문자 l은 1과 비슷하게 생겼으므로 대문자로!


        /* 교재p43
         LongExample */
        long var1 = 10;
        long var2 = 20L;
//        long var3 = 100000000000000; // 컴파일러는 int로 간주하기 때문에 에러발생! 따라서 아래와 같이 끝에 L 붙여줘야 함
        long var4 = 100000000000000L;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var4 = " + var4);
    }
}

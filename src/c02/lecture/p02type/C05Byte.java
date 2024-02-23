package c02.lecture.p02type;

public class C05Byte {
    public static void main(String[] args) {
        // byte
        // 최소값 -128 // 1000 0000 앞이 1로 시작하는건 음수로 판단하자...?
        // 최대값 127 // 0111 1111 앞이 0인건 양수로 판단하자...?
        // 라고 했데...  그리고 설명 햐주신 내용 이해가 잘 안됨...😭😭 일단 외워

        // 1byte의 저장공간으로 값 표현(=저장)
        // 1byte = 8bit
        // bit = 0 또는 1


        /* 교재p42
         ByteExample */
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127; // 127까지 byte로 표현가능!!
//        byte var6 = 128; // 컴파일 에러(Type mismatch: cannot convert from int to byte)

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);
    }
}

package ch15.lecture.p6of;

import java.util.Set;

public class C02Set {
    public static void main(String[] args) {
        Set<String> set1 = Set.of("spring", "java", "css", "react");
        System.out.println("set1 = " + set1); // 출력시 순서 보장되지 않음

//      set1.add("vue"); // of로 만들었기 때문에 추가, 삭제, 수정 안됨.. 오류뜸

    }
}

package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        // HashSet 저장할 공간 생성.
        Set<Member> set = new HashSet<Member>();

        // Member에 객체 저장
        set.add(new Member("홍길동",30));
        set.add(new Member("홍길동",30));

        // 저장된 객체 수
        System.out.println("총 객체 수 : " + set.size());

    }
}

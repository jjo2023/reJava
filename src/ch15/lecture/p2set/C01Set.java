package ch15.lecture.p2set;

import java.util.HashSet;
import java.util.Set;

public class C01Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // 추가ㅑ add
        set.add("java");
        set.add("spring");
        set.add("html");
        set.add("react");

        // 크기.. 저장하고 있는 엘레멘트의 갯수
        System.out.println(set.size()); // 4

        // set은 중복이 안되니까.. 원소가 없는 놈만 추가 되, 한 반에 동명이인인 놈들 안받아
        boolean b1 = set.add("css");// o
        boolean b2 = set.add("java");// x 추가 안됭..! 이미 있으니까..중복 안된다구!!
        System.out.println("b1 = " + b1); // true
        System.out.println("b2 = " + b2); // false

        // 검색 contains
        boolean b3 = set.contains("angular"); // 없는 애를 찾네...? 그니까 false 반환.

        // 삭제 remove
        set.remove("java");
        set.remove("css");
        System.out.println(set.size()); // 두개 삭제 했자나...그럼 3개 되겠지..
        boolean b4 = set.remove("jsp");// 없는 새끼를 어케 삭제하겠어? 그니까 false 반환.
        System.out.println("b4 = " + b4);
        System.out.println(set.size()); // 그리고 원소(=element)의 갯수는 여전히 3개.




    }
}

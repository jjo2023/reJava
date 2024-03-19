package ch15.lecture.p1list;

import java.util.List;

public class C05Of {
    public static void main(String[] args) {
        // List.of 로  수정 불가능한 리스트 객체 생성
        List<String> list1 = List.of();
        System.out.println(list1.size());

        List<String> list2 = List.of("java");
        System.out.println(list2.size());
        System.out.println(list2);

        List<String> list3 = List.of("react", "vue", "jsp");
//        list3.add("hello"); // exception 발생..! List.of는 수정 불가능한 메소드이기 때문에
        System.out.println(list3);

        // 중첩된 List
        List<List<Integer>> list5 = List.of(
          List.of(95,96),
          List.of(83,92,96),
          List.of(78,83,93,87,88)
        );

    }
}

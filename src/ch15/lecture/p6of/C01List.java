package ch15.lecture.p6of;

import java.util.ArrayList;
import java.util.List;

public class C01List {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("css");
        list1.add("html");
        list1.add("react");
        System.out.println("list1 = " + list1);

        // of_ of 메소드를 이용해 넣은 애들은 수정 불가함
        List<String> list2 = List.of("java", "css", "html", "react");
        System.out.println("list2 = " + list2);
    }
}

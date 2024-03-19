package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        Set<String> set = new HashSet<String>();

        // 객체 추가하기
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        // 객체를 하나씩 가져와서 처리
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println( element);
            if (element.equals("JSP")){
                iterator.remove();
            }
        }
        System.out.println();

        // 객체 제거
        set.remove("JDBC");

        // 객체를 하나씩 가져와서 처리
        for (String element : set){
            System.out.println(element);
        }
    }
}

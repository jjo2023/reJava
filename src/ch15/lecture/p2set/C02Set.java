package ch15.lecture.p2set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("css");
        set.add("spring");

        // set에 담긴 놈들은 순서가 없어... 걍 주머니에 들어있다고 생각하면 됨

        // 그래서..전체탐색시 고전적 for는 못써!!
        // 향상된 for 사용
        System.out.println("##향상된 for");
        for (String item : set){
            System.out.println(item);
        }

        // forEach 메소드 사용.. 이해안되서 안따라침..



        // Iterator 사용
        // 주요 메소드 :
        //  1. hasNext 다음에 탐색할 아이템이 있는지? 있냐 없냐니까 불리언을 리턴
        //  2. next 다음 아이템 리턴
        //  주로..! while문을 사용
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}

package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Map 컬렉션 생성~ 저장 할 곳 만든거임
        Map<String, Integer> map = new HashMap<>();

        // 저장할 곳 만들었으면 뭐한다?? 저장해야지..
        // map은 뭘로 담는다??_put
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("김자바", 80);
        map.put("홍길동", 95); // 키가 같기 때문에 제일 마지막에 저장한 값만 저장
        System.out.println(map.size()); // 3

        // 키로 값 얻기_get
        Integer value = map.get("홍길동");
        System.out.println("value = " + value); // 95

        // 키로 엔트리 삭제_remove
        map.remove("홍길동");
        System.out.println(map.size()); // 홍길동 삭제 했으니까...2
    }
}

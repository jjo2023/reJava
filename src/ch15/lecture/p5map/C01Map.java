package ch15.lecture.p5map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01Map {
    public static void main(String[] args) {
        // map : entry (key, value)를 저장
        // 같은 키를 가진 두개의 엔트리를 저장 할 수 없음
        Map<String, String> map = new HashMap<>();

        // entry 추가
        map.put("java", "programming language");
        map.put("css", "style sheet");
        map.put("html", "hyper text markup language");
        map.put("spring", "java framework");
        map.put("react", "front library");
        map.put("css", "style sheet");

        // map 크기
        System.out.println(map.size()); // key 중복 불가 이므로 5

        // entry 검색, key가 있는지.. key로 검색
        map.containsKey("java"); // true
        map.containsKey("ccc"); // false

        // entry의 value얻기, key를 넣어서 value를 얻어냄
        String value1 = map.get("java");
        map.get("react");
        System.out.println("value1 = " + value1);

        String value2 = map.get("ccc"); // 없는걸 넣으면??
        System.out.println("value2 = " + value2); // null을 반환한다

        // entry 수정
        map.put("java", "프로그래밍 언어");
        String value3 = map.get("java");
        System.out.println("value3 = " + value3);

        // entry 지우기
        System.out.println(map.size()); // 지우기 전...5
        map.remove("css"); // css 지웠어
        System.out.println(map.size()); // 지운 후...4

        // 전체탐색
        // 1. keySet
        System.out.println("## 향상된for & keySet 방법 ##");
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key + ":" + map.get(key));
        }

        // 2. entrySet


        // 3. forEach
        System.out.println("## forEach 방법 ##");
        map.forEach((k,v)-> System.out.println(k+":"+v));

    }
}




















package ch15.exercise.p9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        // 평균

        // 합계

        // 최고점수
        int maxScore = map.get("blue"); // 96
        System.out.println("최고 점수: " + maxScore);

    }
}

package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        // 저장할 TreeSet 생성~
        TreeSet<Integer> scores = new TreeSet<>();

        // 저장할 그릇을 만들었으니까 객체 저장하기
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        // 그럼 이제 여러 메소드를 이용해보장..!

        // 전체탐색하기
        for (Integer s : scores){
            System.out.print(s + " "); // 줄바꿈 안넣고 가로로 보여지게 하고 싶어어 print 출력문 사용~
        }
        System.out.println();

        // 전체탐색 내리차순으로 정렬해보기
        NavigableSet<Integer> descendingSores = scores.descendingSet();
        for (Integer s : descendingSores){
            System.out.print(s+ " ");
        }


        // 특정 객체 가져오기..
        // 외울 필요없고 TreeSet은 순서가 있기 때문에 이런 메소드들이 존재한다는 걸 이해하고 필요시 찾아서 쓰면 됨
        System.out.println();
        System.out.println("가장 낮은 점수 : " + scores.first()); // 가장 먼저 나온게 가장 작은 수 일꺼니까
        System.out.println("가장 높은 점수 : " + scores.last()); // 가장 마지막 나온게 가장 큰 수 일꺼니까..
        System.out.println("95점 아래 점수 : " + scores.lower(95)); // 95 포함 x
        // 음..근데 87 하나만 가져오네..? 75, 80은 안가져옴
        System.out.println("95점 위의 점수 : " + scores.higher(95)); // 95 포함 x


        // 범위 검색 하기 ( 80 <= score < 95 ) 95는 포함 안되네..훔..
        scores.subSet(80, 95);
        for (Integer s  : scores.subSet(80,95)){
            System.out.print(s + " ");
        }


    }

}

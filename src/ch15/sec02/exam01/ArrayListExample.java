package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArraryList 컬렉션 생성하기.. 저장할 공간 만드는거야
        // list라는 이름의.. ArrayList를 만든거야
        List<Board> list = new ArrayList<>();

        // 저장할 곳 만들었으니까...
        // 객체 추가하기 -> add
        list.add(new Board("제목1", "내용1", "글쓴이는밍냥"));
        list.add(new Board("제목2", "내용2", "밍냥"));
        list.add(new Board("제목3", "내용3", "쪼쪼냥"));
        list.add(new Board("제목4", "내용4", "쪼꼬"));
        list.add(new Board("제목5", "내용5", "춍"));

        // 저장된 객체 수 읽어오기 -> size
        int size = list.size();
        System.out.println("총 객체 수 : " + size);

        // 특정 인덱스의 객체 가져오기 -> get
        list.get(2);
    }
}



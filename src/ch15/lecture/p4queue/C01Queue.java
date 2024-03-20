package ch15.lecture.p4queue;

import java.util.LinkedList;
import java.util.Queue;

public class C01Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // 아이템 추가 offer
        queue.offer("java");
        queue.offer("spring");
        queue.offer("jdbc");
        queue.offer("mariadb");

        System.out.println(queue.size()); // 4개 넣었으니까 4

        // 아이템 꺼내기, 선입 선출이니까 먼저 들어간게 먼저 나옴
        String p1 = queue.poll(); // java
        queue.poll(); // spring
        queue.poll(); // jdbc
        queue.poll(); // mariadb

        System.out.println(queue.size()); // 다 꺼냈으니까 0
        System.out.println(p1); // java

    }
}

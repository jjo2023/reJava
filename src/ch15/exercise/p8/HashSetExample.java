package ch15.exercise.p8;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();

        set.add(new Student(1, "홍길동"));
        set.add(new Student(2, "이멍멍"));
        set.add(new Student(1, "김냥냥")); // studentNum이 같으면 추가 x

        System.out.println("저장된 객체 수 : " + set.size());
        for (Student s : set){
            System.out.println(s.studentNum + ":" + s.name);
        }
    }
}

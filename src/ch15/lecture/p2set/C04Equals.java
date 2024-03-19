package ch15.lecture.p2set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class C04Equals {
    public static void main(String[] args) {
        Set<C04Book> set = new HashSet<>();
        set.add(new C04Book("이것이자바다"));
        set.add(new C04Book("모두의git"));
        set.add(new C04Book("html"));
        set.add(new C04Book("이것이자바다"));

        System.out.println("총 객체 수 : " + set.size());
        System.out.println(set);
    }
}

class C04Book{
    private String title;


    // 생성자 constructor
    public C04Book(String title) {
        this.title = title;
    }

    // 게터, 세터 getter, setter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // 투스트링 toString
    @Override
    public String toString() {
        return "C04Book{" +
                "title='" + title + '\'' +
                '}';
    }

    // equals HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C04Book c04Book = (C04Book) o;
        return Objects.equals(title, c04Book.title);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}

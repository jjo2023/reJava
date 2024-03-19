package ch15.sec03.exam02;

import java.util.Objects;

public class Member {
    public String name;
    public int age;

    // 생성자
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // * * * * * equals() 및 hashCode() 재정의 잘 모르겠음 ㅠㅠㅠㅠㅠ😭 * * * * *


    // equals 재정의
       @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return age == member.age && Objects.equals(name, member.name);
    }

    // hashCode 재정의
       @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

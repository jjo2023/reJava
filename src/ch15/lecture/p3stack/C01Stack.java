package ch15.lecture.p3stack;

import java.util.Stack;

public class C01Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("java");
        stack.push("react");
        stack.push("spring");
        stack.push("css");

        System.out.println(stack.size()); // 4개를 넣었으니까.. 4

        String item = stack.pop(); // css
        stack.pop(); // spring
        stack.pop(); // react
        stack.pop(); // java

        System.out.println(stack.size()); // 4개를 꺼냈으니까.. 0
        System.out.println(item);


    }
}

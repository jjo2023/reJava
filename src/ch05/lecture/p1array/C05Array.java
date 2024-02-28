package ch05.lecture.p1array;

public class C05Array {
    public static void main(String[] args) {
        // 배열의 각 원소에 접근하는 방법 : index 사용

        int[] arr = new int[]{100,200,300};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]); // 네모괄호로 값을 읽거나

        arr[2] = 400; // 값을 변경할 수 있음...arr의 2번 인덱스값을 400으로 변경
        System.out.println(arr[2]);


    }
}

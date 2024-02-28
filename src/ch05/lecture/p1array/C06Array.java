package ch05.lecture.p1array;

public class C06Array {
    public static void main(String[] args) {
        // ★★★★별 오백만개..이해안되면 외워서라도 숙지★★★★★

        // 배열 전체 탐색 하는 방법
        int[] arr = new int[]{7,3,4,5,6,7,8,9,11,23,34};

        for (int i=0; i<10; i++){
        System.out.println(arr[i]);
        }

        // 배결의 길이
        System.out.println("arr.length = " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}

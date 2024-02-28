package ch05.lecture.p1array;

public class C07Array {
    public static void main(String[] args) {
        // 배열 전체 탐색
        int[] arr = new int[]{6,7,8,9,22,34,56,78,99,999};

        // 고전적인 방법
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        // 향상된 for문(=enhanced for문)
        for (int j:arr){
            System.out.println(j);
        }

    }
}

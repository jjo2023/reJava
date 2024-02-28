package ch05.lecture.p1array;

public class C14Copy {
    public static void main(String[] args) {
        int[] arr1={30,40,2,1,5};
        int[] arr2= new int[5];

        System.arraycopy(arr1,0,arr2,0,5);
    }
}

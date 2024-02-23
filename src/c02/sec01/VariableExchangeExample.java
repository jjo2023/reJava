package c02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ",y:" + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x + ",y:" + y);

        System.out.println("- - - - - - -");

        int a = 100;
        int b = 200;

        int swqp  = a;
        a = b;
        b = swqp;

        System.out.println(a);
        System.out.println(b);

    }


}

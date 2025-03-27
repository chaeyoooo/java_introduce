package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = a; // temp 는 10;
        a = b; // b는 20 , a가 20이 되는 것
        b = temp; // b는 10!

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}

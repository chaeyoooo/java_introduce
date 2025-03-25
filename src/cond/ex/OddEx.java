package cond.ex;

public class OddEx {
    public static void main(String[] args) {
        int x = 2;
        String y = (x % 2 ==0)? "짝수" : "홀수";
        System.out.println("x = " + x  + "  y = " + y);
    }

}

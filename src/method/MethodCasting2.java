package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // 자동형 변화
    }
    public static void printNumber(double n){
        System.out.println("숫자 " + n);
    }
}

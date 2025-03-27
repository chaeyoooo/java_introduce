package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;
        long maxIntOver = 2147483648L; // Int 최고값 + 1 (초과)
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntValue casting = " + intValue);
        // int 최고값 보다 하나증가 시켰더니 int의 작은 범위로 회귀함 : 오버플로우 현상 발생
        // 오버플로우가 발생하는것 자체가 문제 ! 그냥 막아야된다 ! 숫자 활용할 생각 X

    }
}

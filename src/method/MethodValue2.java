package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changenumber 호출 전 ,number :" + number);
        chageNumber(number);
        System.out.println("4. changenumber 호출 후 , number :" + number);
    }

    public static void chageNumber(int number){
        System.out.println("2. changeNumber 변경 전 , num2 :" + number);
        number = number *2;
        System.out.println("3. changeNumber 변경 후 , num2: " + number);
        // 메인 메서드와 체인지 넘버에 number는 완전히 다른 지역 변수다!
    }
}

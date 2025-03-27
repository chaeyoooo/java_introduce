package casting;

//묵시적 형변환
public class Casting1 {
    public static void main(String[] args) {
        int intValue = 20;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println("longValue = " + longValue);

        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue2 = " + doubleValue);

        // int < long < double
    }
}

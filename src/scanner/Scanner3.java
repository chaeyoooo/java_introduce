package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번쨰 정수를 입력하세요: ");
        int a = scanner.nextInt();

        System.out.print("두번쨰 정수를 입력하세요: ");
        int b = scanner.nextInt();

        if(a > b){
            System.out.println("첫번째 정수가 더 큽니다" + a);
        } else if (a < b) {
            System.out.println("두번쨰 정수가 더 큽니다" + b);
        } else{
            System.out.println("두 숫자가 같습니다.");
        }

    }
}

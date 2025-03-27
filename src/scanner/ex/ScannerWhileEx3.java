package scanner.ex;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 :");

        while(true){
            input = scanner.nextInt();
            if(input == -1){
                System.out.println("프로그램을 종료");
                break;
            }
            sum += input;
            count++;
        }
        double average = (double)sum/count;
        System.out.println(average);
        System.out.println(sum);
    }
}

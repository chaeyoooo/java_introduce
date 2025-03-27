package scanner.ex;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요 : ");
        int count = scanner.nextInt();

        System.out.println(count + "단의 구구단");

        for (int i = 1; i <= 9; i++){
            System.out.println(count + "*" + i + "=" + count * i);
        }
    }
}

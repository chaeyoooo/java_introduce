package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력받을 숫자의 개수를 입력하세요 :");
        int n = sc.nextInt();

        System.out.println(n + "개의 정수를 입력하세요 :");

        int[] numbers = new int[n];
        int minNumber, maxNumber;

        for(int i= 0; i < n ; i++){
            numbers[i] = sc.nextInt();
        }

        minNumber = numbers[0];
        maxNumber = numbers[0];

        for(int i = 1; i < n ; i++){
            if(numbers[i] < minNumber){
                minNumber = numbers[i];
            }
            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }

        System.out.println("가장 작은 정수 : " + minNumber);
        System.out.println("가장 큰 정수 : " + maxNumber);
    }
}

package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    // 사용자에게 5개의 정수 입력 > 배열에 저장 , 입력 순서대로 출력
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0 ; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("출력");
        for (int i = 0 ; i < numbers.length; i ++){
            System.out.print(numbers[i]);
            if(i< numbers.length -1){
                System.out.print(", ");
            }
        }
    }
}

package array.ex;

import java.util.Scanner;


public class ProductAdiminEx {
    public static void main(String[] args) {
        int maxProducts = 10;
        String[] prodcutsName = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("1. 상품 등록  | 2. 상품 목록 | 3. 종료\n 메뉴를 선택하세요. :");
            int munu = scanner.nextInt();
            scanner.nextLine();

            if(munu == 1){

                if(productCount >= maxProducts){
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요 : ");
                prodcutsName[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요 :");
                productPrices[productCount] = scanner.nextInt();
                productCount++;

            } else if (munu == 2) {
                if(productCount == 0){
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for(int i = 0 ; i < productCount; i++){
                    System.out.println(prodcutsName[i] + " :" + productPrices[i] + "원" );

                }
            }else if(munu == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
}

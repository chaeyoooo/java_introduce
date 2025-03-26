package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j ++){ // j<=i 중요! 내부 문 1,2,3으로 커지기에 !
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

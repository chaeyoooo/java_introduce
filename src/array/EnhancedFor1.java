package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = { 1,2,3,4,5};

        for(int i = 0 ; i < numbers.length; i ++){
            int number = numbers[i];
            System.out.println(number);
        }

        // 향상된 for문 // iter 쓰면 바로 됨 (psvm 처럼)
        for(int number : numbers){
            System.out.println(number);
        }

        //향상된 for문을 못쓰는경우!
        for(int i = 0; i < numbers.length; i++){
            System.out.println("number " + i + "번의 결과는:" + numbers[i]);
        }


    }

}

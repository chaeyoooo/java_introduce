package method;

public class Method1Ref {
    //add 메서드
    public static void main(String[] args) {
        int sum1 = add(5,10); // 넘기는 값 : 인수
        System.out.println("결과 2 출력:" + sum1);

        int sum2 = add(15,20);
        System.out.println("결과 2 출력:" + sum2);
    }
    public static int add(int a , int b){ // add 앞에 있는 int 값을 반환해라! 메서드 선언(메서드 이름 , 반환 타입 , 파라미터 목록)
        System.out.println(a  + "+"  + b + " 연산 수행"); // 메서드 본문
        int sum = a + b;
        return sum;
    }
}

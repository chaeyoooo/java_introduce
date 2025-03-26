package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if(m > 0){
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
// 지금 if 코드 블록에서만 temp가 필요한데 , 현재 main에 temp가 있어서 메모리에 계속 유지되는 현상이 발생
// 이는 비효율적인 메모리 사용 , 코드 복잡성(만약 temp가 있으면 main에 있다면 if가 끝난다음에 생각해야하는 변수가 m , temp가 됨 -> 따라서 복잡)
// 이 증가하는 문제가 발생하게 됨

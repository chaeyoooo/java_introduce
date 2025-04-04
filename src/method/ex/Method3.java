package method.ex;

public class Method3 {
    public static void main(String[] args) {
        int balance = 10000;

        int depositAmount = 1000;
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하셨습니다. 현재 잔액 : " + balance  +"원");

        int withdrawAmount = 2000;
        if (balance >= withdrawAmount){
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금 하셨습니다. 현재 잔액 " + balance + "원");
        }else{
            System.out.println(withdrawAmount + "원을 출금 하려 했으나 잔액이 부족합니다.");
        }

        System.out.println("최종 잔액 " + balance + "원");
    }
}

package method.ex;

public class Method2Ref {
    public static void main(String[] args) {
        String message = "Hello, world";
        pringMessage(message,3);
        pringMessage(message,5);
        pringMessage(message,7);
    }
    public static void pringMessage(String message , int times){
        for (int i = 0; i < times ; i++){
            System.out.println(message);
        }
    }
}

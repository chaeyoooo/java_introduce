package loop;

public class While2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        while( i <= endNum){
            sum = sum + i;
            System.out.println("i= " + i + " sum= " + sum );
            i++;
            //여기서 i는 main에 있으니까 코드 범위가 넓어지는 단점 for은 for문 안에서만 i에서만 쓰니까! 유지보수,메모리 관점에서 더 좋음

        }
    }
}

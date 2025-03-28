package array;

public class ArrayRef1 {
    public static void main(String[] args) {
        int[] students; // int형 배열을 담을 수 있는 변수 배열 선언 // 배열이나 객체는 참조형
        students = new int[5]; // 배열 생성


        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        for(int i = 0; i < students.length ; i++){
            System.out.println("학생" + (i + 1) + "점수 :" + students[i]);
        }
    }
}

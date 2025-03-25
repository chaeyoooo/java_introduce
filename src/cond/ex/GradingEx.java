package cond.ex;

public class GradingEx {
    public static void main(String[] args) {
        String grade = "A";

        if (grade == "A"){
            System.out.println("탁월한 성과입니다.");
        } else if (grade =="B") {
            System.out.println("좋은 성과입니다.");
        } else if (grade == "C") {
            System.out.println("준수한 성과입니다.");
        } else if (grade == "D") {
            System.out.println("향상이 필요합니다.");
        } else if (grade == "F") {
            System.out.println("불합격입니다.");
        }else{
            System.out.println("잘못된 학점입니다.");
        }
    }
}

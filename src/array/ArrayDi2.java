package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        // 2* 3 배열
        int[][]  arr = new int[4][4];

        // 하나씩 배열 넣기
        int i = 1;
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                arr[row][column] = i++;
            }
        }

        for (int row=0; row < arr.length ; row++){
            for(int col=0; col <arr[row].length ; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args){
        int [] array = new int[10];
        for (int i = 0; i < array.length-1; i++){
            array [i] = (int) Math.round(Math.random() * 100);
            System.out.print(array[i] + " ");
        }
    }
}
//Arrays.deepToString(matrix1) -  для вывода массива на экран
import java.util.Arrays;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.println("Введите размер массива");
        length = scanner.nextInt();
        int[] array = new int[length];
        int i = 0;
        do  { System.out.print("Введите " + i + " -ое число ");
        array[i] = scanner.nextInt();
        i++;
        } while(i<array.length);
        System.out.println(Arrays.toString(array));
    }
}



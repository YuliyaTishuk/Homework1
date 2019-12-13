import java.util.Arrays;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.println("Введите размер массива");
        length = scanner.nextInt();
        int[] array = new int[length];
        int i = 0;
        while (i < array.length) {
            System.out.print("Введите " + i + " -ое число ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}

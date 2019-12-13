import java.util.Arrays;
import java.util.Scanner;
//вывод массива при помощи for и выврод каждого второго элемента
public class PrintEverySecondElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length;

        System.out.println("Введите размер массива");
        length=scanner.nextInt();

        int [] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите " + i + " -ое число ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < length; i+=2) {
            System.out.println(array[i]);
        }
//        System.out.print(Arrays.toString(array));
    }
}

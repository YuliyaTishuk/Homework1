import java.util.Arrays;
import java.util.Scanner;

//перемножение чисел между собой
public class MultiplyNumbers {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 0; i < args.length; i++) {
            sum *= Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}

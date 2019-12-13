import java.util.Scanner;
//Перемножение цифр  числа между собой
public class Test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Ваше число");
        int n = scan.nextInt();
        int result = result(n);
        System.out.println("Result = " + result);
    }

    private static int result(int number) {
        if (number > 10) {
            int remainder = number / 10;
            int digit = number % 10;
            int result = result(remainder);
            System.out.println(digit + "*" + result);
            return result * digit;
        } else {
            return number;
        }

    }
}
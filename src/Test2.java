import java.util.Scanner;

public class Test2 {
    static int factorial(int a) {
        int otvet = 1;
        for (int i = 1; i <= a; i++) {
            otvet *= i;
        }
        return otvet;
            }
        public static void main (String[]args){
            Scanner vvod = new Scanner(System.in);
            System.out.println("Введите целое число: ");
            int d = vvod.nextInt();
            factorial(d);
            System.out.println("Ваш ответ " +  factorial(d));
        }
    }


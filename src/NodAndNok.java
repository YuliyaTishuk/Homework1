import java.util.Scanner;

//вычисление НОД и НОК двух чисел a и b
public class NodAndNok {
    private static int gcd(int a, int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
        private static int lcm(int a, int b){
        return  a = a * b / gcd(a, b);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("НОД числа " + a + " и числа " + b + " = " + gcd(a,b));
        System.out.println("НОК числа " + a + " и числа " + b + " = " + lcm(a,b));
    }
}

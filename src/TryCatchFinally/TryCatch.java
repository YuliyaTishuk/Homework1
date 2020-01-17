package TryCatchFinally;

public class TryCatch {
    public static int division(int a, int b) {
        int result = 0;
        try {
            result = a / b;
            System.out.println("Ваш ответ " + result);
        } catch (ArithmeticException d) {
            System.out.println(d);
            System.out.println("На ноль делить нельзя!");
        }
        return result;
    }
    public static void main(String[] args) {
        int c = division(4, 0);
    }
}


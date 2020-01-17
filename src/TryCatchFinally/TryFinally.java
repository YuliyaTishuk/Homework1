package TryCatchFinally;

public class TryFinally  {
    public static int division(int a, int b) {
        int result = 0;
        try {
            result = a / b;
            System.out.println("Ваш ответ " + result);
        } finally {
            System.out.println("На ноль делить нельзя!");
        }return result;
    }
    public static void main(String[] args) throws ArithmeticException{
        int c = division(4, 0);
    }
}



package TryCatchFinally;

public class TryCatch {
    public static int division(int a, int b) {
        int result = 0;
        try {
            result = a / b;
            System.out.println("Ваш ответ " + result);
        } catch (Exception byZero) {
            System.out.println("Ошибка: " + byZero.getMessage());
        }
        return result;
    }

    public static void main(String[] args) {
        int c = division(4, 0);
    }
}


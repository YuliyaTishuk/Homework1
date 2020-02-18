package TryCatchFinally;

public class TryCatchFinally {
    public static int division(int a, int b) {
        int result = 0;
        try {
            result = a / b;
            System.out.println("Ваш ответ " + result);
        } catch (Exception byZero) {
            System.err.println("Ошибка: " + byZero.getMessage());
        }finally {
            System.out.println("Запомните, на ноль делить нельзя!(по крайней мере в этой программе)");
        }
        return result;
    }
    public static void main(String[] args) {
        int c = division(4, 0);
    }
}


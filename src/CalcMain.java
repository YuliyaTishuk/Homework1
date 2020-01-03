import java.util.Scanner;

public class CalcMain {
    final static Scanner sc = new Scanner(System.in);

    public int divide(int number, int number2) {
        int resultShare = number / number2;
        System.out.println(number + " / " + number2 + " = " + resultShare);
        return resultShare;
    }

    public int multiply(int number, int number2) {
        int resultMultiply = number * number2;
        System.out.println(number + " * " + number2 + " = " + resultMultiply);
        return resultMultiply;
    }

    public int addition(int number, int number2) {
        int resultAddition = number + number2;
        System.out.println(number + " + " + number2 + " = " + resultAddition);
        return resultAddition;
    }

    public int subtraction(int number, int number2) {
        int resultSubtraction = number - number2;
        System.out.println(number + " - " + number2 + " = " + resultSubtraction);
        return resultSubtraction;
    }

    public static void main(String[] args) {
        CalcMain calculator = new CalcMain();

        System.out.print("Входное выражение: ");
        while(sc.hasNext()) {
            int number = sc.nextInt();
            char operation = sc.next().charAt(0);
            int number2 = sc.nextInt();

            switch (operation) {
                case '/':
                    calculator.divide(number, number2);
                    break;
                case '*':
                    calculator.multiply(number, number2);
                    break;
                case '+':
                    calculator.addition(number, number2);
                    break;
                case '-':
                    calculator.subtraction(number, number2);
                    break;
                default:
                    System.out.println("Введте выражение ");
            }
            System.out.print("Входное выражение: ");
        }

    }
}

//        int addition = calculator.addition(number, number2);
//        int number3 = sc.nextInt();
//        int multiply = calculator.multiply(addition, number3);
//        int number4 = sc.nextInt();
//        int share = calculator.share(multiply, number4);


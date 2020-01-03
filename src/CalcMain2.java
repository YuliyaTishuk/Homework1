import java.util.Scanner;

class CalcMain2 {

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
        CalcMain2 calculator = new CalcMain2();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number2 = sc.nextInt();
        int addition = calculator.addition(number, number2);
        int number3 = sc.nextInt();
        int multiply = calculator.multiply(addition, number3);
        int number4 = sc.nextInt();
        int share = calculator.divide(multiply, number4);
        System.out.println(share);//решение ((6+6)*6) /15
    }
}



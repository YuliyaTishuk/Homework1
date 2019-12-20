import java.util.Scanner;

//найти наибольшую цифру натурального числа
//проверить, является ли число палиндромом
//определить яыляется ли число простым
//найти все простые делители числа
//найти кол-во различных цифр у заданюго натурального числа
public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число ");
        int number = sc.nextInt();
        if (number < 1) {
            System.out.println("Вы ввели не натуральное число");
        } else {
            boolean isPrime = isPrime(number);
            System.out.println("Ваше число является простым: " + isPrime);
            System.out.println("Наибольшая цифрв Вашего натурального числа " + isMax(number));
            isPalindrom(number);
            numberOfDigits(number);
            System.out.println("Количество цифр в Вашм числе " + numberOfDigits(number));
            isPrimeDivisor(number);
        }
    }
    //ищет максимальную цифру
    private static int isMax(int number) {
        int digit, numberMax = 0;
        while (number > 0) {
            digit = number % 10;
            if (digit > numberMax) numberMax = digit;
            number /= 10;
        }
        return numberMax;
    }
    //проверяет, простое или нет
    private static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (isDivisor(number, i)) {
                return false;
            }
        }
        return true;
    }
    //проверяет палиндром или нет
    private static int isPalindrom(int number) {
        int numCopy = number;
        int reverseNum = 0;

        while (numCopy != 0) {
            reverseNum = reverseNum * 10 + numCopy % 10;
            numCopy /= 10;
        }
        if (reverseNum == number) {
            System.out.println("Ваше число палиндром");
        } else {
            System.out.println("Ваше число не палиндром");
        }
        return numCopy;
    }
    //находит количество цифр в числе
    private static int numberOfDigits(int number) {
        return String.valueOf(Math.abs(number)).length();//Метод Math.abs() — дает абсолютное значение аргумента(модуль числа)
    }                                                    //Метод valueOf() преобразует в нужный тип данных, в нашем случае в int
    //находит все простые делители числа
    private static void isPrimeDivisor(int number) {
        System.out.println("Все простые делители Вашего числа " + number + ": ");
        boolean isFirst = true;
        for (int i = 3; i < number / 2; i++) {
            if (isDivisor(number, i) && isPrime(i)) {
                if (!isFirst) {
                    System.out.print(", ");
                }
                System.out.print(i);
                isFirst = false;
            }
        }
    }

    private static boolean isDivisor(int number, int i) {
        return number % i == 0;
    }
}



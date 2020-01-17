package Attempt;

import java.util.Scanner;

public class Programm {
//    public void attempt(int a) throws AttemptException {
//        int b = 0;
//        final int pass = 159;
//        for (int i = 0; i<3; i++){
//            if (b==pass){
//                System.out.println("Вы ввели верный пароль");
//            }else {
//                System.out.println("Вы ввели неверный пароь. Повторите ввод");
//            }
//        }
//        try {
//            if (a>3){
//                throw new AttemptException("Вы использовали три попытки");
//            }
//        }catch (AttemptException z){
//            System.out.println(z.getMessage());
//        }
//    }

    public static void main(String[] args) throws AttemptException {
        Scanner sc = new Scanner(System.in);
        final int pass = 159;
        int attempt;
        int size = sc.nextInt();
        int[] array = new int[size];
        while (size < 3) {
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
        System.out.println("Ведите пароль");
        int b;
        b = sc.nextInt();
        for (attempt = 0; attempt < 3; attempt++) {
            if (b == pass) {
                System.out.println("Вы ввели верный пароль");
                break;
            } else {
                System.out.println("Вы ввели неверный пароь. Повторите ввод");
                b = sc.nextInt();
            }attempt++;
        }
        if (attempt > 3 && b !=pass) {
            System.out.println("Вы использовали три попытки");
        }

        }
    }
}






//        int size = sc.nextInt();
//        Integer[] mass = new Integer[size];
//
//        try {
//            while (size < 4) {
//                for (int i = 0; i < mass.length; i++) {
//                    mass[i] = sc.nextInt();
//
//                    throw new AttemptException("Вы использовали три попытки");
//                }
//            }
//        } catch (AttemptException z) {
//            System.out.println(z.getMessage());
//        }
    //}
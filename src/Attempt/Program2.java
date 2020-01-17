package Attempt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program2 {
    public static void transformation (int[] array){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i<array.length; i++) arrayList.add(array[i]);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        int attemtion = 0;
        System.out.println("Добавьте числа в массив: ");
        for (int i = 0; i < size; i++)
             try {
                   {
                       array[i] = sc.nextInt();
                   }
               } catch (InputMismatchException a) {
                 sc.next();
                 System.out.println("Введите число");
                 attemtion++;
             }if (size==array.length){
                   transformation(array);
             }
    }

}


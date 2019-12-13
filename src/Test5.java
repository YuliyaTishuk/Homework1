import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
    private static int[] quickSort(int[] array, int start, int end) {
        if (start >= end) return array;
        int i = start;
        int j = end;
        int o = i - (i - j) / 2;

        while ((i < j)) {
            while ((i < o) && (array[i] <= array[o])) i++;
            while ((j > o) && (array[j] >= array[o])) j--;
            if (i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                if (i == o) o = j;
                else if (j == o) o = i;
            }

        }
        quickSort(array, start, o);
        quickSort(array, o + 1, end);

        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length;

        System.out.println("Введите размер массива");
        length=scanner.nextInt();

        int [] array = new int[length];

        for (int i = 0; i < array.length; i++) {//i+=2 для вывода второго числа
            System.out.print("Введите " + i + " -ое число ");
            array[i] = scanner.nextInt();
        }
        array = Arrays.stream(array).distinct().toArray();//distinct().Метод, возвращает метод без дубликатов

        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

}


import java.util.Arrays;


public class Bubble {
    public static void main(String[] args) {
        int[] array = {1, -4, 2, 88, 95481, -59, 0};
        System.out.println("Массив до сортировки " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
                    System.out.println("Массив после сортировки" + Arrays.toString(array));
                }
            }

        }
    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
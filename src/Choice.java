import java.util.Arrays;

public class Choice {
    public static void main(String[] args) {
        int[] c = {5, 1, 158, -4, 0, -18, 459, 1524986};
        System.out.println("Массив до сортировки " + Arrays.toString(c));
        select(c);
        System.out.println("Массив после сортировки " + Arrays.toString(c));
    }

    public static void select(int[] array) {
        int min;
        for (int a = 0; a < array.length - 1; a++) {
            min = array[a];
            for (int b = a + 1; b < array.length - 1; b++) {
                if (array[b] < min) {
                    min = array[b];
                    swap(array, a, b);
                }

            }

        }
    }

    private static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}

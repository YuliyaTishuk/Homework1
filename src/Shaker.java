import java.util.Arrays;

public class Shaker {
    public static void main(String[] args) {
        //int[] array = new int[]{1, -4, 2, 88, 95481, -59, 0};
        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        // int[] array = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();

        System.out.println("Массив до сортировки " + Arrays.toString(array));

        int left = 1;
        int right = array.length - 1;
        do {
            for (int i = right; i >= left; i--) {
                swapIfLess(array, i);
            }
            left++;
            for (int i = left; i <= right; i++) {
                swapIfLess(array, i);
            }
            right--;
        } while ((left <= right));

        System.out.println("Массив после сортировки " + Arrays.toString(array));
    }

    private static void swapIfLess(int[] array, int i) {
        if (array[i - 1] > array[i]) {
            ArrayUtils.swap(array, i, i - 1);
        }
    }
}

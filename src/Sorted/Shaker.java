package Sorted;

public class Shaker {
    static void shakersort(int[] array, int k, int l){

        int left = 1;
        int right = array.length - 1;
        do {
            for (int i = right; i >= left; i--) {
                swap(array, i);
            }
            left++;
            for (int i = left; i <= right; i++) {
                swap(array, i);
            }
            right--;
        } while ((left <= right));

    }

    private static void swap(int[] array, int i) {
        if (array[i - 1] > array[i]) {
            int tmp = array[i-1];
            array [i-1] = array [i];
            array[i] = tmp;
        }
    }
}

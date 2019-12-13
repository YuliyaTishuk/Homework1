import java.util.Arrays;

public class Merge {

    public static int[] array = {19, 7, 6, 15, 2, 6, 2, 4, 8, 16};

    private static void merge(int begin, int end) {
        int mid = (begin + end) / 2;

        int[] t = new int[end - begin + 1];

        int index_1 = begin;

        int index_2 = mid + 1;

        int index_t = 0;

        while ((index_1 <= mid) || (index_2 <= end)) {
            if (index_1 > mid) {
                t[index_t++] = array[index_2++];
                continue;
            }
            if (index_2 > end) {
                t[index_t++] = array[index_1++];
                continue;
            }
            if (array[index_2] > array[index_1]) {
                t[index_t++] = array[index_1++];
                continue;
            } else {
                t[index_t++] = array[index_2++];
                continue;
            }
        }
        for (int i = 0; i < end - begin + 1; i++) {
            array[i + begin] = t[i];
        }
        System.out.println(Arrays.toString(t));
    }

    private static void sort(int start, int finish) {
        System.out.println("Sort " + start + ".." + finish);

        if (start == finish) // выход из рекурсии - массив из 1 элемента отсортирован по определению
            return;

        int mid = (start + finish) / 2; //

        sort(start  , mid);    // сортировка 1-й половины массива
        sort(mid + 1, finish); // сортировка 2-й половины массива
        merge(start, finish);
    }

    public static void main(String args[]) {
        System.out.println(Arrays.toString(array)); // до сортировки
        sort(0, array.length - 1);               // сртировка
        System.out.println(Arrays.toString(array)); // после сортировки
    }
}
package Sorted;

public class Quick {

    static int[] quickSort(int[] array, int start, int end) {
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

}
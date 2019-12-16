public class Merge {
    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;

            sort(array, start, middle);
            sort(array, middle + 1, end);

            merge(array, start, middle, end);
        }
    }

    private static void merge(int[] array, int start, int middle, int end) {
        int leftMiddle = middle - start + 1;
        int rightMiddle = end - middle;

        int[] leftArray = new int[leftMiddle];
        int[] rightArray = new int[rightMiddle];

        for (int i = 0; i < leftMiddle; ++i) {
            leftArray[i] = array[start + i];
        }
        for (int j = 0; j < rightMiddle; ++j) {
            rightArray[j] = array[middle + 1 + j];
        }

        int i = 0, j = 0;

        int k = start;
        while (i < leftMiddle && j < rightMiddle) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftMiddle) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightMiddle) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

}


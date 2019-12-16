public class Choice {

    public void choiceSort(int[] array, int i, int i1) {
        int min;
        for (int a = 0; a < array.length - 1; a++) {
            min = array[a];
            for (int b = a + 1; b < array.length; b++) {
                if (array[b] < min) {
                    min = array[b];
                    swap(array, a, b);
                }
                }
            }
        }
    private void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}

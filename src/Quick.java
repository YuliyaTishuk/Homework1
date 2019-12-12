import java.util.Arrays;

public class Quick {
    public static int[] quicqSort (int [] array, int start, int end) {
        if (start>=end) return array;
        int i = start;
        int j = end;
        int o = i - (i-j)/2;

        while ((i<j)){
            while ((i < o) && (array[i] <= array[o])) i++;
            while ((j > o) && (array[j] >= array[o])) j--;
            if (i < j){
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                if (i == o) o = j;
                else if ( j == o) o = i;
            }

        }
        quicqSort (array, start,o);
        quicqSort (array, o+1, end);

        return array;
    }

       public static void main(String[] args) {
        int [] array = new int[] {0,7,45,-9,-16,25,2487,13,-8};
        System.out.println("Массив до сортировки " + Arrays.toString(array));
           quicqSort(array, 0, array.length - 1);
           System.out.println("Массив после сортировки" + Arrays.toString(array));
    }
}

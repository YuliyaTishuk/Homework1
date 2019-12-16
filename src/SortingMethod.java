import java.util.Arrays;
//использование сортировок в классе
public class SortingMethod {
    public static void main(String[] args) {
        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        Choice myChoice = new Choice();
        Bubble myBubble = new Bubble();
        Quick myQuick = new Quick();
        Shaker myShaker = new Shaker();
        Merge myMerge = new Merge();
        System.out.println("Массив до сортировки " + Arrays.toString(array));
        myChoice.choiceSort(array, 0, array.length - 1);
        System.out.println("Массив после сортировки выбором " + Arrays.toString(array));
        myBubble.bubbleSort(array, 0, array.length - 1);
        System.out.println("Массив после сортировки пузырьком " + Arrays.toString(array));
        myQuick.quickSort(array, 0, array.length - 1);
        System.out.println("Массив после быстрой сортировки  " + Arrays.toString(array));
        myShaker.shakersort(array, 0, array.length - 1);
        System.out.println("Массив после сортировки шйкером  " + Arrays.toString(array));
        myMerge.sort(array);
        System.out.println("Массив после сортировки слиянием  " + Arrays.toString(array));
    }
}

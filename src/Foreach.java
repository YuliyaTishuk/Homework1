import java.util.Arrays;
import java.util.Scanner;

public class Foreach {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length;

        System.out.println("Введите размер массива");
        length = scanner.nextInt();

        IntHolder[] array = new IntHolder[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = new IntHolder(0);
        }
        int counter = 1;
        for (IntHolder b : array) {
            System.out.print("Введите " + counter + " -ое число ");
            b.value = scanner.nextInt();
            counter++;
        }
        System.out.println(Arrays.toString(array));
    }

    private static class IntHolder {
        private int value;

        private IntHolder(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "" + value;
        }
    }
}



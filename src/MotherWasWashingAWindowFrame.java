import java.util.Scanner;

public class MotherWasWashingAWindowFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = sc.nextLine();
        String a = "Мама мыла раму";

        System.out.println("Сравниваем объекты: " + (a == input));
        System.out.println("Помещаем в пул и сравниваем: " + (a == input.intern()));
    }
}
//intern - Данный метод добавляет строку в String Pool(кэш строк). Происходит перелпределение
// ссылки  литерал. Он организует поиск в "пуле литералов" (в пул попадают только строки,
// созданные через литерал" ") и вернёт String из кэша.

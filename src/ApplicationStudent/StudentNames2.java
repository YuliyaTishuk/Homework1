package ApplicationStudent;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentNames2 {
    private static List<String> maleLastNames = Arrays.asList("Иванов", "Петров", "Сидоров", "Егоров", "Смирнов", "Филимонов", "Кисилёв", "Сорокиин", "Жуков", "Романов", "Быков");
    private static List<String> maleNames = Arrays.asList("Иван", "Сергей", "Виктор", "Семён", "Ярослав", "Егор", "Алексей", "Михаил", "Кирилл", "Дмитрий");
    private static List<String> malePatronymics = Arrays.asList("Иванович", "Петрович", "Евгеньевич", "Григорьевич", "Андреевич", "Михайлович", "Васильевич", "Борисович", "Романович", "Павлович");
    private static List<String> femaleLastNames = Arrays.asList("Иванова", "Петрова", "Сидорова", "Морозова", "Волкова", "Лебедева", "Степанова", "Николаева", "Кузнецова", "Смирнова");
    private static List<String> femaleNames = Arrays.asList("Мария", "Вера", "Елена", "Ксения", "Агата", "Василиса", "Марина", "Нина", "Оксана", "Светлана");
    private static List<String> femalePatronymics = Arrays.asList("Ивановна", "Петровна", "Васильевна", "Марковна", "Юрьевна", "Денисовна", "Богдановна", "Валентиновна", "Фёдоровна", "Кондратьевна");
    private static List<String> studentGrade = Arrays.asList("0","1","2","3","4","5","6","7","8","9","10");

    private static Random random = new SecureRandom();

    public static void main(String[] args) throws IOException {
        String students = Stream.generate(StudentNames2::generateRandomFullName).limit(100)
                .collect(Collectors.joining("\r\n"));

        Files.writeString(Paths.get("d:/studentsList.txt"), students, StandardOpenOption.CREATE);

    }

    private static String generateRandomFullName() {
        boolean isMale = random.nextBoolean();
        if (isMale) {
            return generateRandomName(maleLastNames, maleNames, malePatronymics,studentGrade);
        } else {
            return generateRandomName(femaleLastNames, femaleNames, femalePatronymics, studentGrade);
        }
    }

    private static String generateRandomName(List<String> lastNames, List<String> names, List<String> patronymics, List<String> studentGrade) {
        String lastName = randomElement(lastNames);
        String name = randomElement(names);
        String patronymic = randomElement(patronymics);
        String grade = randomElement(studentGrade);
        return lastName + " " + name + " " + patronymic + " " + grade;
    }

    private static String randomElement(List<String> list) {
        return list.get(random.nextInt(list.size()));
    }
}

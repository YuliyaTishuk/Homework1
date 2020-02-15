package ApplicationStudent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentNames3 {
    private static List<String> maleLastNames = Arrays.asList("Иванов", "Петров", "Сидоров", "Егоров", "Смирнов", "Филимонов", "Кисилёв", "Сорокиин", "Жуков", "Романов", "Быков", "Суходолец", "Жуков", "Ростов", "Чацкий", "Загайнов", "Грозный", "Лермонтов", "Морозов", "Волков", "Лебедев", "Степанов", "Николаев", "Кузнецов", "Смирнов", "Каренин", "Громов", "Пушкин", "Казаков", "Голубев", "Шишкин");
    private static List<String> maleNames = Arrays.asList("Иван", "Сергей", "Виктор", "Семён", "Ярослав", "Егор", "Алексей", "Михаил", "Кирилл", "Дмитрий", "Руслан", "Виталий", "Лукьян", "Макар", "Назар", "Яков");
    private static List<String> malePatronymics = Arrays.asList("Иванович", "Петрович", "Евгеньевич", "Григорьевич", "Андреевич", "Михайлович", "Васильевич", "Борисович", "Романович", "Павлович", "Эдуардович", "Федотович", "Геннадьевич", "Львович", "Венедиктович", "Ильич", "Анатольевич", "Васильевич", "Маркович", "Юрьевич", "Денисович", "Богдановича", "Валентинович", "Фёдорович", "Кондратьевич", "Евсеевич");
    private static List<String> femaleLastNames = Arrays.asList("Иванова", "Петрова", "Сидорова", "Морозова", "Волкова", "Лебедева", "Степанова", "Николаева", "Кузнецова", "Смирнова", "Каренина", "Громова", "Пушкина", "Казакова", "Голубева", "Шишкина", "Егорова", "Смирнова", "Филимонова", "Кисилёва", "Сорокиина", "Жукова", "Романова", "Быкова", "Суходолец", "Ростова", "Чацкая", "Загайнова", "Грозная", "Лермонтова");
    private static List<String> femaleNames = Arrays.asList("Мария", "Вера", "Елена", "Ксения", "Агата", "Василиса", "Марина", "Нина", "Оксана", "Светлана", "Авдотья", "Аглая", "Лия", "Тамара", "Ярославна", "Прасковья", "Серафима");
    private static List<String> femalePatronymics = Arrays.asList("Ивановна", "Петровна", "Васильевна", "Марковна", "Юрьевна", "Денисовна", "Богдановна", "Валентиновна", "Фёдоровна", "Кондратьевна", "Евсеевна", "Пафнутьевна", "Ростиславовна", "Савельевна", "Тимофеевна", "Федотовна", "Евгеньевна", "Григорьевна", "Андреевна", "Михайловна", "Васильевна", "Борисовна", "Романовна", "Павловна", "Эдуардовна");
    private static List<String> studentGrade = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

    private static Random random = new SecureRandom();

    public static void main(String[] args) throws IOException {
        String students = Stream.generate(StudentNames3::generateRandomFullName).limit(100)
                .sorted()
                .collect(Collectors.joining("\r\n"));

        Files.writeString(Paths.get("d:/studentsList.txt"), students, StandardOpenOption.CREATE);

    }

    private static String generateRandomFullName() {
        boolean isMale = random.nextBoolean();
        if (isMale) {
            return generateRandomName(maleLastNames, maleNames, malePatronymics, studentGrade);
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

    class StudentGrade {
        private int grade;

        public StudentGrade(int grade) {
            this.grade = new SecureRandom().nextInt(10);
        }

        public Integer getGrade() {
            return grade;
        }

        public String toSting() {
            return " - " + grade;
        }

        class GradeComparator implements Comparator<StudentGrade> {
            @Override
            public int compare(StudentGrade o1, StudentGrade o2) {
                return o1.getGrade().compareTo(o2.getGrade());
            }

        }
    }
}

//Comparator <StudentGrade> sortedStudentGrade = (o1, o2) -> o1.getGrade().compareTo(o2.getGrade());






package MotherWasWashing;

public class MamaMalaRam {
    public static void main(String[] args) {
        String firstString = "Мама мыла раму";
        String secondString = "Мама " + "мыла " + "раму";
        System.out.println(firstString);
        System.out.println(secondString);
        System.out.println(firstString == secondString);//вывод true  стал возможен при добавлении пробелов (невидимых символов) при написании второй фразы
    }
}

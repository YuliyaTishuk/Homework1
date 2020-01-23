package Expressions;

public class ExpressionMatches {
    public static void main(String[] args) {
        String string = "Я люблю JAVA";
        System.out.println(string.matches("(.+)JAVA(.+)"));
        System.out.println(string.matches("(.*)JAVA(.*)"));
        System.out.println(string.matches("(.?)JAVA(.?)"));


    }
}
//пытается сопоставить с шаблоном весь текст.
// Он возвращает булево значение true, если весь текст соответствует шаблону.
//В Java matches() возвращает значение true, если, и только в том случае,
// если эта строка соответствует заданному регулярному выражению.
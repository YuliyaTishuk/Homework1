package Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expressions {
    public static void main(String[] args) {
        String str = "Я люблю JAVA";
        Pattern pattern = Pattern.compile("^[А-Я]{1}+ [а-я]{5}+ [A-Z]{4}$");
        Pattern pattern1 = Pattern.compile("^[А-Я]* [а-я]* [A-Z]*$]");
        Pattern pattern2 = Pattern.compile("^[А-Я]? [а-я]? [A-Z]?]");
//        Matcher matcher = pattern.matcher(str);
//        Matcher matcher = pattern1.matcher(str);
        Matcher matcher = pattern2.matcher(str);
        System.out.println(matcher.find());
    }
}
//Квантификатор определяет частоту появления элемента.
// + * ? определяют количество регулярных выражений:
//
//"[А-Я]+\\s[а-я]+\\s[A-Z]]"
//Метод boolean find() ищет очередное совпадение в тексте с шаблоном.
// С помощью этого метода и оператора цикла можно производить анализ всего
// текста по событийной модели (осуществлять необходимые операции при наступлении события –
// нахождении совпадения в тексте).
//пытается найти последовательность символов,
// соответствующих шаблону, в любом месте строки.
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WarAndPeace {

    private static Pattern PATTERN = Pattern.compile("\\b([Вв]ойна|И|и|[Мм]ир)\\b");

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Please specify the file name");
            System.exit(0);
        }

        List<String> fileContents = Files.readAllLines(Paths.get(args[0]));
        calculateWordCount(fileContents);
    }

    private static void calculateWordCount(List<String> fileContents) {
        Map<String, Integer> wordCount = new HashMap<>() {
            { // init block
                put("война", 0);
                put("мир", 0);
                put("и", 0);
            }
        };
        for (String line : fileContents) {
            Matcher matcher = PATTERN.matcher(line);
            while (matcher.find()) {
                String word = matcher.group(1).toLowerCase();//если убрать то выведет отдельно слова с маленькой и большой буквы.
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}


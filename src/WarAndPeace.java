import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WarAndPeace {

    public static void main(String[] args) {
        try{
            File book = new File("Война и мир.txt");
            FileReader newBook = new FileReader(book);
            BufferedReader myBook = new BufferedReader(newBook);
            String line = myBook.readLine();
            Pattern warPattern = Pattern.compile("\bвойна\b");
            Matcher warMatcher = warPattern.matcher(line);
            int count = 0;
            while (warMatcher.find()){
                count++;
                System.out.println("Найдено совпадений " + count);
                System.out.println("Начало " + warMatcher.start());
                System.out.println("Конец " + warMatcher.end());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }


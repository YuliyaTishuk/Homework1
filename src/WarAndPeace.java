import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WarAndPeace {
    public static void wordWar(String war){
        Pattern warPattern = Pattern.compile("\\dвойна\\d");
       // Matcher warMatcher = warPattern.matcher(line);

    }
    public static void main(String[] args) {
        try{
            File book = new File("C:\\Война и мир.txt");
            FileReader newBook = new FileReader(book);
            BufferedReader myBook = new BufferedReader(newBook);
            String line = myBook.readLine();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }


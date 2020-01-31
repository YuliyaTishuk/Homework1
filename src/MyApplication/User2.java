package MyApplication;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class User2 {
    public static void main(String[] args) {
        List<User>user = new ArrayList<>();
        User n = new User("234@rty", "Филимонов Иван", "12345");
        user.add(n);
        Chat chat = new Chat();


        try( OutputStream stream = new FileOutputStream("file_text.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream);) {
            //objectOutputStream.writeObject(n);
            objectOutputStream.writeObject(user);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

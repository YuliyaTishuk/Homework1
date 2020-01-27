package MyApplication;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

public class SaverMessage implements ISaverChat{
    private String filename;
    private FileOutputStream stream;

    public SaverMessage(){
        this("default_name.txt");
    }

    public SaverMessage(String fileName){
        this.filename = filename;
    }
    public SaverMessage (FileOutputStream stream){
        this.stream = stream;
    }
    @Override
    public void save(Chat chat) {
        List<? extends  Message> mess = chat.getMessage();
        try {
            PrintWriter myMess = new PrintWriter(new FileOutputStream("my_message"));
            for(Message message:mess)
            myMess.println("Моё сообщение");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

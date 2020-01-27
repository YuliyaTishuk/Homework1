package MyApplication;

import java.util.List;

public class ConsolerSaver implements ISaverChat {


    @Override
    public void save(Chat chat) {
        List<? extends Message> message = chat.getMessage();
        for (Message messages:message){
           System.out.println(message);
        }
    }
}

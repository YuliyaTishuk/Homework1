package MyApplication;

import java.util.List;

public class SaverChat implements ISaverChat {

    @Override
    public void save(Chat chat) {
        List<Message> messages = chat.getMessage();
        for (Message message:messages){
            System.out.println(messages);
        }
    }
}

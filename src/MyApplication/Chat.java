package MyApplication;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Chat implements ISaverChat{
    Set<User> users = new HashSet<>();
    public void addMessage (Message message){
        addMessage(message);
    }
    public void addMessage (Message[] messages){
        addMessage(messages);
    }
    public void addMessage(List<Message> message){
        addMessage(message);
    }

    public void getMessage(){
        getMessage();
    }

    @Override
    public void save(Chat saver) {
        saver.save(this);
    }


     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return Objects.equals(users, chat.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }



}

package MyApplication;

import java.util.*;

public class Chat implements ISaverChat{
    private  final Set<User> users = new HashSet<>();
    private final List<Message> myMessage = new ArrayList();

    public void addMessage (Message message){
        this.myMessage.add(message);
    }
    public void addMessage (Message[] messages){
        if(myMessage!=null){
            for (Message message:messages){
                this.myMessage.add(message);
            }
        }
    }
    public void addMessage(List<Message> message){
        addMessage(message);
    }

    public List<Message> getMessage(){
        getMessage();
        return null;
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

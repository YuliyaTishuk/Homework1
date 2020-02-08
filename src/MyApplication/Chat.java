package MyApplication;

import java.io.Serializable;
import java.util.*;

public class Chat implements ISaverChat, Serializable {
    private final Set<User> users = new HashSet<>();
    private final List<Message> messages = new ArrayList<>();

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public void addMessage(Message[] messages) {
        this.messages.addAll(Arrays.asList(messages));
    }

    public void addMessage(List<Message> messages) {
        this.messages.addAll(messages);
    }

    public List<Message> getMessage() {
        return messages;
    }

    public static void main(String[] args) {
        Chat chat = new Chat();
        Chat chat2 = new Chat();

        chat.save(chat2);
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

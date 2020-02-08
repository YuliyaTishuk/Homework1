package MyApplication;

import java.time.LocalDateTime;
import java.util.StringJoiner;

public class Message {
    private final MessagePayload data;
    private final LocalDateTime date;
    private final User user;

    public Message(User user,MessagePayload data) {//И еще один со всеми праметрами
        this(user, data, LocalDateTime.now());
    }

    public Message(User user, MessagePayload data, LocalDateTime date) {
        this.user = user;
        this.data = data;
        this.date = date;
    }

    public MessagePayload getData() {
        return data;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Message.class.getSimpleName() + "[", "]")
                .add("data=" + data)
                .add("date=" + date)
                .add("user=" + user)
                .toString();
    }
}

interface MessagePayload {
    MessageType getType();
}
class TextPayload implements MessagePayload {

    @Override
    public MessageType getType() {
        return MessageType.TEXT;
    }
}
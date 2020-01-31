package MyApplication;

import javax.xml.crypto.Data;
import java.util.Date;

public class Message <T> {
    private TypeMessage typeMessage;//вернуть тип
    private T data;
    private Date date = new Date();
    private final User user;

    public Message(User user) {//И еще один со всеми праметрами
        this.user = user;
    }
    public Message(User user, T data, Date date, TypeMessage typeMessage){
        this.user = user;
        this.data = data;
        this.date = date;
        this.typeMessage = typeMessage;
    }

    public T getData() {
        return data;
    }
    public void setData(T data){
        this.data =  data;
    }

    public Date getDate() {
        return date;
    }

    public void  setDate(Date date){
        this.date = date;
    }



    @Override
    public String toString() {
        return "Message{" +
                "typeMessage=" + typeMessage +
                ", data=" + data +
                ", date=" + date +
                '}';
    }
}

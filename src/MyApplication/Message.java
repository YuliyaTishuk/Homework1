package MyApplication;

import java.util.Date;

public class Message <T> {
    TypeMessage typeMessage;
    private T data;
    Date date = new Date();
    //объект типа юзер

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

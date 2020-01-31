package MyApplication;

import java.io.*;

public class SaverChatObgectOutputStream {

    public void serialization(Chat chat){
        File chats = new File("save_chat.txt");
        ObjectOutputStream myChat = null;
        try {
            FileOutputStream saverChat = new FileOutputStream(chats);
            if(saverChat!=null){
                try {
                    myChat = new ObjectOutputStream(saverChat);
                    myChat.writeObject(chat);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if(myChat!=null){
                try {
                    myChat.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

package MyApplication;

import java.io.*;
import java.nio.file.Path;
import java.util.Objects;
import java.util.UUID;

public class User implements Serializable {
    private final String id;
    private String fio;
    private String parol;


    public User(String id, String fio, String parol) {
        this.id = id;
        this.fio = fio;
        this.parol = parol;
    }

    public String getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getParol() {
        return parol;
    }

    public void setParol(String parol) {
        this.parol = parol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(fio, user.fio) &&
                Objects.equals(parol, user.parol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fio, parol);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", fio='" + fio + '\'' +
                ", parol='" + parol + '\'' +
                '}';
    }

    public String writeObject(String path) throws IOException {
        String filename = path + "file" + UUID.randomUUID() + ".txt";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(this);
            return filename;
        }
    }

    public static User readFromFile(String filePath) throws IOException, ClassNotFoundException {
        try(ObjectInputStream is = new ObjectInputStream(new FileInputStream(filePath))) {
            return (User) is.readObject();
        }
    }
     public static void main(String[] args) throws IOException, ClassNotFoundException {
        User object = new User("ab", "ab", "ab");

        String file = object.writeObject("d:/");

        User newUser = User.readFromFile(file);
        System.out.println(newUser);

    }

}


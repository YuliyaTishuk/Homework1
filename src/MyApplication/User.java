package MyApplication;

import java.io.Serializable;
import java.util.Objects;

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
    public void writeObject(){

    }
}

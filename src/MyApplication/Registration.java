package MyApplication;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Registration {
    private ConcurrentMap<String, String> users = new ConcurrentHashMap<>();

    // нужно добавть юзера и майл, юзера проверить на вилидацию, вызвать метод из класса валидации, если квсё корректно присвоить id
    // и добавить в коллекцию юзеров
    public void registerUser(String userName, String userPassword) throws Exception {
        if (PasswordValidation.isValid(userPassword)) {
            if (!Objects.equals(users.putIfAbsent(userName, userPassword), userPassword)) {
                throw new Exception("Такое имя пользователя уже используется");
            }
        } else {
            throw new Exception("Ваш пароль не соответсвует требования безопасности");
        }
    }

    public static void main(String[] args) throws Exception {
        Registration registration = new Registration();
        registration.registerUser("user", "password!D3");
        registration.registerUser("user", "pasfdd!D3");
    }
}

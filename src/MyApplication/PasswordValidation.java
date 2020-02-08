package MyApplication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
    private static final String passwordValid = "((?=.*d)(?=.*[a-z])(?=.*[A-Z])(?=.*[:/!?+%]).{7,15})";

    private static final Pattern password = Pattern.compile(passwordValid);

    public static boolean isValid(String myPassword) {
        Matcher passwordMatcher = password.matcher(myPassword);
        return passwordMatcher.matches();
    }
}

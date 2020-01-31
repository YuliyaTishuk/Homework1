package MyApplication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    private static final String passwordValid = "((?=.*d)(?=.*[a-z])(?=.*[A-Z])(?=.*[:/!?+%]).{7,15})";

    private final Pattern password;
    private Matcher passwordMatcher;

    public Validation(){
        password = Pattern.compile(passwordValid);
    }
    public boolean valid(String myPassword){
        passwordMatcher = password.matcher(myPassword);
        return passwordMatcher.matches();
    }
   }

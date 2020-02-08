package MyApplication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    private Pattern emailPattern;
    private Matcher emailMatcher;
    private static final String emailValid = "^[a-zA-Z0-9]{1,}”+”((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*”+”@”\n" +
            "+”[a-zA-Z0-9]{1,}”+”((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*”+”\\.[a-zA-Z]{2,}$";
    public EmailValidation(){
        emailPattern = Pattern.compile(emailValid);
    }
    public boolean valid (String email){
        emailMatcher = emailPattern.matcher(email);
        return emailMatcher.matches();
    }
}

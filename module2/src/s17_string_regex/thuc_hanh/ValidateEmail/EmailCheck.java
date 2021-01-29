package s17_string_regex.thuc_hanh.ValidateEmail;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck {

    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX =   "^[\\w]*@[\\w]+(\\.[\\w]+)$";
    public boolean validate(String regex) {
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

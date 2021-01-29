package s17_string_regex.thuc_hanh.ValidateAcount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountCheck {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String ACCOUNT_REGEX =   "^[_a-z0-9]{6,}$";
    public static boolean validate(String regex) {
        pattern = Pattern.compile(ACCOUNT_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

package s17_string_regex.bai_tap.check_telephoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneCheck {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String TELEPHONE_REGEX = "^[(][\\d]{2}[)]-[(][0][\\d]{9}[)]$";
    public static boolean validate(String regex) {
        pattern = Pattern.compile(TELEPHONE_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

package s17_string_regex.bai_tap.check_className;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassCheck {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String CLASS_REGEX =   "^[CAP][0-9]{4}[GHIKLM]$";
    public static boolean validate(String regex) {
        pattern = Pattern.compile(CLASS_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

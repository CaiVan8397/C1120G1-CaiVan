package case_study.Commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FunctionCheckDataInput {
    public static boolean checkCodeService(String regex){
        final String CLASS_REGEX =   "^SV(VL|HO|RO)\\d{4}$";
         Pattern pattern = Pattern.compile(CLASS_REGEX);
         Matcher matcher= pattern.matcher(regex);
         return matcher.matches();
    }
}

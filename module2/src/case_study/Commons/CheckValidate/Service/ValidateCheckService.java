package case_study.Commons.CheckValidate.Service;

import java.util.regex.Pattern;

public class ValidateCheckService {
    public static boolean idVillaValid(String idVilla) {
        final String ID_VILLA_REGEX = "^(SVVL-)[0-9]{4}$";
        return Pattern.matches(ID_VILLA_REGEX,idVilla);
    }
    public static boolean idHouseValid(String idHouse){
        final String ID_HOUSE_REGEX="^(SVHO-)[0-9]{4}$";
        return Pattern.matches(ID_HOUSE_REGEX,idHouse);
    }
    public static boolean idRoomValid(String idRoom){
        final String ID_ROOM_REGEX="^(SVRO-)[0-9]{4}$";
        return Pattern.matches(ID_ROOM_REGEX,idRoom);
    }
//    public static boolean regexBirthday (String birthday){
//        final String CLASS_REGEX = "^([0-2][1-9]|[1-3]0|31)/(0[1-9]|1[0-2])/(190[1-9]|19[1-9]\\d|2\\d{3})$";
//        return Pattern.matches(CLASS_REGEX, birthday);
//    }
    public static boolean regexAcreage (String acreage){
        final String CLASS_REGEX = "^(30\\.\\d*[1-9]|((3[1-9])|([4-9]\\d)|([1-9]\\d{2,}))(\\.\\d+)?)$";
        return Pattern.matches(CLASS_REGEX, acreage);
    }
    public static boolean regexFloor(int floor){
        final String CLASS_REGEX = "^[1-9]+|[1-9][0-9]$";
        return Pattern.matches(CLASS_REGEX, Integer.toString(floor));
    }
    public static boolean regexName(String name){
        final String CLASS_REGEX = "^[A-Z][a-z0-9]+$";
        return Pattern.matches(CLASS_REGEX, name);
    }
    public static boolean regexEquipment (String externalService){
        final String CLASS_REGEX = "^(massage|karaoke|food|drink|car)$";
        return  Pattern.matches(CLASS_REGEX,externalService);
    }

    public static boolean feeValid(double fee) {
        String FEE_REGEX = "^[1-9]+|[1-9][0-9]\\.[\\d]+$";
        return Pattern.matches(FEE_REGEX,Double.toString(fee));
    }
    public static boolean regexPeopleValid(String people) {
        String PEOPLE_REGEX = "^(0?[1-9]|(0?[1][0-9]))$";
        return Pattern.matches(PEOPLE_REGEX,people);
    }
}

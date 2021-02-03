package case_study.Commons.CheckValidate.Customer;


public class ValidateCheckCustomer {
    public static boolean regexName(String name) {
        return name.matches("^[A-Z][a-z\\s?]*$");
    }
    public static boolean regexBirthDay (String birthday){
        return  birthday.matches("^([0-2][1-9]|[1-3]0|31)/(0[1-9]|1[0-2])/(190[1-9]|19[1-9]\\d|2\\d{3})$");
    }
    public static boolean regexCardIdCustomer(String cardId) {
        return cardId.matches("\\d{3}(([ ]\\d{3}){2})");
    }

    public static boolean regexPhoneNumber(String phoneNumber) {
        return phoneNumber.matches( "(0)\\d{9}" );
    }

    public static boolean regexGenderCustomer(String gender) {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder( "" );

        String str = gender.substring( 0, 1 );
        str = str.toUpperCase();

        String str1 = gender.substring( 1 );
        str1 = str1.toLowerCase();

        stringBuilder.append( str );
        stringBuilder.append( str1 );
        String genderString = stringBuilder.toString();

        return genderString.matches( "(Male|Female|Unknown)" );
    }



    public static boolean regexEmailCustomer(String email) {
        return email.matches( "^[a-z0-9]+@[a-z]+\\.[a-z]+" );
    }



    public static boolean regexTypeOfCustomer(String typeOfCustomer) {
        return typeOfCustomer.matches( "(Diamond|Platinum|Gold|Silver|Member)" );
    }



    public static boolean regexAddress(String address){
        return address.matches( "[A-Z][a-z]+([ ][A-Z][a-z]+)*" );
    }


}

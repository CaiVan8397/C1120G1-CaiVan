package s17_string_regex.thuc_hanh.ValidateEmail;

public class TestEmail {
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        EmailCheck emailCheck = new EmailCheck();
        for (String email : validEmail) {
            boolean isvalid = emailCheck.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailCheck.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}

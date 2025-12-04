
import java.util.regex.Pattern;

public class MobileValidation {

    private static final String MOBILE_NUMBER_PATTERN = "^\\+?1?\\d{3,14}$";

    public static boolean isValidMobileNumber(String number) {
        return Pattern.matches(MOBILE_NUMBER_PATTERN, number);
    }

    public static void main(String[] args) {
        // Test the validator
        System.out.println(isValidMobileNumber("+91 1234567890")); // true
        System.out.println(isValidMobileNumber("91-1234567890")); // true
        System.out.println(isValidMobileNumber("1234567890")); // false
        System.out.println(isValidMobileNumber("(+91) 1234567890")); // false
    }
}

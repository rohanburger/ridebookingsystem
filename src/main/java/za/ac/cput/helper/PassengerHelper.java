package za.ac.cput.helper;

/*  PassengerHelper.java
    Passenger helper class
    Author: Kelsey-Jane Fabe (220328293)
    Date: 20/03/2025
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassengerHelper {
    public static boolean isNullOrEmpty(String str) {
        if(str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    //check if email is valid
    public static boolean isValidEmail(String email) {
        if (isNullOrEmpty(email))
            return false;

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern p = Pattern.compile(emailRegex);
        Matcher m = p.matcher(email);

        //returns true if email matches pattern
        return email != null && p.matcher(email).matches();
    }
}

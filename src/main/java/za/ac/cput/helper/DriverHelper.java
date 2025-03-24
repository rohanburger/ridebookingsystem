package za.ac.cput.helper;

/*
    DriverHelper.java
    Driver Helper Class
    Author:Kyle Bowers
    Date:22/03/2025
*/

public class DriverHelper {
    public static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public static boolean isInvalidPhoneNumber(String phoneNumber) {
        return phoneNumber == null || !phoneNumber.matches("\\d{10}");
    }

    public static boolean isInvalidEmail(String email) {
        return email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    public static boolean isInvalidLicense(String licenseNum) {
        return licenseNum == null || licenseNum.length() < 5;
    }
}

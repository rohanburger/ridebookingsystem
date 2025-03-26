package za.ac.cput.factory;
import za.ac.cput.domain.*;
import za.ac.cput.helper.DriverHelper;
/*
    DriverFactory.java
    Driver Factory Class
    Author:Kyle Bowers
    Date:22/03/2025
*/

public class DriverFactory {
    public static Driver createDriver(String driverId, String driverName, String driverSurname,
                                      String driverPhoneNum, String driverEmail, String licenseNum) {
        if (DriverHelper.isNullOrEmpty(driverName) || DriverHelper.isNullOrEmpty(driverSurname)) {
            System.out.println("Error: Driver Name or Surname is null or empty");
        }

        if (DriverHelper.isInvalidPhoneNumber(driverPhoneNum)) {
            System.out.println("Error: Driver Phone Number is invalid");
        }

        if (DriverHelper.isInvalidEmail(driverEmail)) {
            System.out.println("Error: Driver Email is invalid");
        }

        if (DriverHelper.isInvalidLicense(licenseNum)) {
            System.out.println("Error: Driver License Number is invalid");
        }

    }
}

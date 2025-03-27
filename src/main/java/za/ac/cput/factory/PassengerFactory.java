package za.ac.cput.factory;

/*  PassengerFactory.java
    Passenger factory class
    Author: Kelsey-Jane Fabe (220328293)
    Date: 20/03/2025
*/

import za.ac.cput.domain.BankDetails;
import za.ac.cput.domain.Passenger;
import za.ac.cput.helper.PassengerHelper;

public class PassengerFactory {
    public static Passenger createPassengerWithAllAttributes(String passid,
                                            String passName,
                                            String passSurname,
                                            String passPhoneNum,
                                            String passEmail,
                                            BankDetails bankdetails) {

        if (PassengerHelper.isNullOrEmpty(passid) || PassengerHelper.isNullOrEmpty(passName) ||
                PassengerHelper.isNullOrEmpty(passSurname) || PassengerHelper.isNullOrEmpty(passPhoneNum) ||
                PassengerHelper.isNullOrEmpty(passEmail)) {
            System.out.println("Passenger field(s) are empty. Please fill in your information");
            return null;

        }

        if(!PassengerHelper.isValidEmail(passEmail)) {
            System.out.println("Invalid email. Try again");
            return null;
        }

        if(!PassengerHelper.isNullOrEmpty(passid)) {
            return null;
        }

        return new Passenger.PassengerBuilder()
                .setPassid(passid)
                .setPassName(passName)
                .setPassSurname(passSurname)
                .setPassPhoneNum(passPhoneNum)
                .setPassEmail(passEmail)
                .setBankdetails(bankdetails)
                .build();

    }

    public static Passenger createPassenger(String passid, String passName, String passSurname) {
        //create Passenger with id, name, and surname attributes
        if((PassengerHelper.isNullOrEmpty(passid) || PassengerHelper.isNullOrEmpty(passName) ||
                PassengerHelper.isNullOrEmpty(passSurname))) {
            System.out.println("Passenger field(s) are empty. Please fill in your information");
            return null;
        }

        return new Passenger.PassengerBuilder()
                .setPassid(passid)
                .setPassName(passName)
                .setPassSurname(passSurname)
                .build();
    }
}

package za.ac.cput.factory;

/*  PassengerFactory.java
    Passenger factory class
    Author: Kelsey-Jane Fabe
    Date: 20/03/2025
*/

import za.ac.cput.domain.BankDetails;
import za.ac.cput.domain.Passenger;
import za.ac.cput.helper.PassengerHelper;

public class PassengerFactory {
    public static Passenger createPassenger(String passid,
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

        return new Passenger.PassengerBuilder()
                .setPassid(passid)
                .setPassName(passName)
                .setPassSurname(passSurname)
                .setPassPhoneNum(passPhoneNum)
                .setPassEmail(passEmail)
                .setBankdetails(bankdetails)
                .build();

    }
}

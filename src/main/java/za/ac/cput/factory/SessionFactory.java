package za.ac.cput.factory;
import  za.ac.cput.domain.Session;
import za.ac.cput.helper.SessionHelper;

/*
    SessionFactory.java
    Session Factory Class
    Author:Rohan Janzen Burger
    Date:19/03/2025
*/
public class SessionFactory {
    public static Session createSession(String sessionID,Passenger passenger,Driver driver,Location location,String passengerCount, float sessionAmount,String sessionStatus){
        if (SessionHelper.isNullOrEmpty(passengerCount) || SessionHelper.isNullOrEmpty(sessionStatus)){
            System.out.println( "Error:Passenger Count or Session Status is null or empty");
            if (SessionHelper.notValidStatus(sessionStatus)){
                System.out.println("Error:Session Status is not valid");
            }
        }

        if (SessionHelper.tooLowAmountOrEmpty(sessionAmount)){
            System.out.println("Error:Session Amount is too low or empty");
        }

        return new Session.Builder()
                .setSessionid(sessionID)
                .setPassenger(passenger)
                .setDriver(driver)
                .setLocation(location)
                .setPassengerCount(passengerCount)
                .setSessionAmount(sessionAmount)
                .setSessionStatus(sessionStatus)
                .build();
    }

}


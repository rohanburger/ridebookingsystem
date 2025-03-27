package za.ac.cput.factory;
import za.ac.cput.domain.*;
import za.ac.cput.helper.SessionHelper;

/*
    SessionFactory.java
    Session Factory Class
    Author:Rohan Janzen Burger
    Date:19/03/2025
*/
public class SessionFactory {
    public static Session createSession(String sessionID, Passenger passenger, Driver driver, Location location, int passengerCount, float sessionAmount, String sessionStatus){

        if (SessionHelper.isNullOrEmpty(sessionID)){//calls the String null or empty methods and assigned SessionId to the paremete of the methods
            System.out.println("Error:Session ID is null or empty");//Output message if the if statement is true
        }
        if (SessionHelper.isZero(passengerCount)){//call the methods , check if value is equal to zero
            System.out.println( "Error:Passenger Count is Zero");//Output message if the if is true
        }

        if (SessionHelper.isNullOrEmpty(sessionStatus)) {//calls the String null or empty methods and assigned sessionStatus to the paremete of the methods
            System.out.println("Error:Session Status is null or empty");//Output message if the if is true
        }else {
            if (SessionHelper.notValidStatus(sessionStatus)) {//Check if the status is a valid status
                System.out.println("Error:Session Status is not valid");//Output message if the if is true
            }
        }

        if (SessionHelper.tooLowAmount(sessionAmount)){//Methods called ensuring the value meets the specified criteria
            System.out.println("Error:Session Amount is too low ");//Output message if the if is true
        }

        return new Session.Builder() //constructuon of the session object
                .setSessionid(sessionID)//Chains muliple setter methods togther
                .setPassenger(passenger)
                .setDriver(driver)
                .setLocation(location)
                .setPassengerCount(passengerCount)
                .setSessionAmount(sessionAmount)
                .setSessionStatus(sessionStatus)
                .build();//Create and return the session object
    }

}


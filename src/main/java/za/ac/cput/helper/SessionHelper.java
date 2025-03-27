package za.ac.cput.helper;

import za.ac.cput.domain.Passenger;

/*
    SessionHelper.java
    Session Helper Class
    Author:Rohan Janzen Burger
    Date:19/03/2025
*/
public class SessionHelper {
    public static boolean isNullOrEmpty(String s){
        if(s.isEmpty() || s==null){//String validation Empty or Null
            return true;//When Empty or null
        }
        return false;//When not empty or equal to null
    }
    public static boolean isZero(int s){
        if(s <= 0){//Checks if int value is less or equal to 0
            return true;//When less or equal to 0
        }
        return false;//When greater or equal to 0
    }

    public static boolean tooLowAmount(Float s){
        if(s < 30 ){//Checks if float is smaller than 30
            return true;//When float is smaller than 30
        }
        return false;//When float is greater than 30
    }

    public static boolean notValidStatus(String s) {
        if (s.equals("Expired") || s.equals("Pending") || s.equals("Active")) {//Checks if the string equals any of these values
            return false;//When not equals to any
        }
        return true;//When equals to any
    }



}

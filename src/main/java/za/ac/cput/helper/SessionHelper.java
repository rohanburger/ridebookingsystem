package za.ac.cput.helper;
/*
    SessionHelper.java
    Session Helper Class
    Author:Rohan Janzen Burger
    Date:19/03/2025
*/
public class SessionHelper {
    public static boolean isNullOrEmpty(String s){
        if(s.isEmpty() || s==null ){
            return true;
        }
        return false;
    }


    public static boolean tooLowAmountOrEmpty(Float s){
        if(s < 30 ||s.isNaN()){
            return true;
        }
        return false;
    }

    public static boolean notValidStatus(String s){
        if( s.equals("Expired") ||s.equals("Pending")||s.equals("Accepted")){
            return true;
        }
        return false;
    }



}

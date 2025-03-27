package za.ac.cput.helper;

public class LocationHelper {

    public static Boolean isEmptyOrNull(String s){
        if(s.isEmpty()||s.isBlank()||s==null){
            return true;
        }
        return false;
    }

    public static Boolean isEqual(String a, String b){
        if(a.equals(b)){
            return false;
        }
        return true;
    }






}

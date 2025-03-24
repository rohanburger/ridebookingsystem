package za.ac.cput.factory;
import org.w3c.dom.ls.LSOutput;
import za.ac.cput.domain.Location;
import za.ac.cput.helper.LocationHelper;


public class LocationFactory {
    
    
    
    public static Location createLocation(String locationId, String pickupStreet, String pickupSuburb, String pickupCity, String dropoffStreet, String dropoffSuburb, String dropoffCity){
        if(LocationHelper.isEmptyOrNull(locationId)){
            System.out.println("Location ID is null or empty");
        }
        if(LocationHelper.isEmptyOrNull(pickupStreet)||LocationHelper.isEmptyOrNull(pickupSuburb)||LocationHelper.isEmptyOrNull(pickupCity)){
            System.out.println("Pickup Infromation is incomplete");
        }
        if(LocationHelper.isEmptyOrNull(dropoffStreet)||LocationHelper.isEmptyOrNull(dropoffSuburb)||LocationHelper.isEmptyOrNull(dropoffCity)){
            System.out.println("Dropoff Infromation is incomplete");
        }

        Location location=new Location();

        if(LocationHelper.isEqual(location.pickupDetails(),location.dropoffDetails())){
            System.out.println("Pickup Location and Dropoff Location cannot be the same");
        }
        

        return new Location.LocationBuilder()
                .setLocationId(locationId)
                .setPickupStreet(pickupStreet)
                .setPickupSuburb(pickupSuburb)
                .setPickupCity(pickupCity)
                .setDropoffStreet(dropoffStreet)
                .setDropoffSuburb(dropoffSuburb)
                .setDropoffCity(dropoffCity)
                .build();

    }



}

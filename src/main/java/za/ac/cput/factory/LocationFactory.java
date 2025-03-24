package za.ac.cput.factory;
import org.w3c.dom.ls.LSOutput;
import za.ac.cput.domain.Location;
import za.ac.cput.helper.SessionHelper;

public class LocationFactory {
    public static Location createLocation(String locationId, String pickupStreet, String pickupSuburb, String pickupCity, String dropoffStreet, String dropoffSuburb, String dropoffCity){
        if(SessionHelper.isNullOrEmpty(locationId)){
            System.out.println("Location ID is null or empty");
        }
        if(SessionHelper.isNullOrEmpty(pickupStreet)||SessionHelper.isNullOrEmpty(pickupSuburb)||SessionHelper.isNullOrEmpty(pickupCity)){
            System.out.println("Pickup Infromation is incomplete");
        }
        if(SessionHelper.isNullOrEmpty(dropoffStreet)||SessionHelper.isNullOrEmpty(dropoffSuburb)||SessionHelper.isNullOrEmpty(dropoffCity)){
            System.out.println("Dropoff Infromation is incomplete");
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

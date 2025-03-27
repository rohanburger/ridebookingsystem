package za.ac.cput.repository;

import za.ac.cput.domain.Location;

import java.util.ArrayList;
import java.util.List;

public class LocationRepository implements ILocationRepository{

    private static ILocationRepository repository=null;
    private List<Location> locationList;

    private LocationRepository(){
        locationList = new ArrayList<Location>();
    }

    public static ILocationRepository getRepository(){
        if(repository==null){
            repository = new LocationRepository();
        }
        return repository;
    }

    @Override
    public List<Location> getAll() {
        return new ArrayList<>(locationList);
    }

    @Override
    public boolean create(Location location) {
        return locationList.add(location);
    }

    @Override
    public Location read(String locationId) {
        for(Location location : locationList){
            if(location.getLocationId().equals(locationId)){
                return location;
            }
        }

        return null;
    }

    @Override
    public boolean update(String locationId, Location location) {
        for(Location locationList1 : locationList){
            if(locationList1.getLocationId().equals(locationId)){
                locationList.remove(locationList1);
                locationList.add(location);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(String locationId) {
        for(int i=0; i<locationList.size(); i++){
            if(locationList.get(i).getLocationId().equals(locationId)){
                locationList.remove(i);
                return true;
            }
        }
        return false;
    }

    public void clearLocation(){
        locationList.clear();
    }


}

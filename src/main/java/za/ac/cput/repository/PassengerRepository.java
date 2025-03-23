package za.ac.cput.repository;

import za.ac.cput.domain.Passenger;
import java.util.ArrayList;
import java.util.List;

//overrides methods from the Repository class
public class PassengerRepository implements IPassengerRepository {
    private static IPassengerRepository passengerRepository = null; //declare variable of IPassengerRepository
    private List<Passenger> passengerList; //declare list that forms actual database

    //can only call constructor in PassengerRepository
    private PassengerRepository(){
        passengerList = new ArrayList<Passenger>(); //constructs arraylist of passenger objects to list
    }

    public static IPassengerRepository getRepository(){
        if(passengerRepository == null){ //if passengerRepository has not been initialised (first time)
            passengerRepository = new PassengerRepository(); //constructs arraylist of passenger objects if passengerRepository has not already been initialised

        }
        return passengerRepository;
    }

    @Override
    public List<Passenger> getAll() {
        return null;
    }

    @Override
    public boolean create(Passenger passenger) {
        return passengerList.add(passenger); //creates object of Passenger class
    }

    @Override
    public Passenger read(String passengerId) { //represents pk of passenger record
        for(Passenger passenger : passengerList){
            if(passenger.getPassid().equals(passengerId)){ //check if passid object matches pk in the arraylist
                return passenger; //return if Passenger object is found in the list
            }
        }
        return null; //return if not found
    }

    @Override
    public boolean update(String passengerId, Passenger passenger) {
        for (Passenger passList : passengerList) {
            if (passList.getPassid().equals(passengerId)) {
                passengerList.remove(passList); //removes current Passenger object
                passengerList.add(passenger); //adds updated Passenger object
                return true; //return if object was updated
            }
        }
        return false; //return if not found
    }

    @Override
    public boolean delete(String passengerId) {
        for(Passenger passenger : passengerList){
            if(passenger.getPassid().equals(passengerId)){
                passengerList.remove(passenger); //remove the passenger from the list
                return true; //return if deleted
            }
        }
        return false; //return if not found
    }
}

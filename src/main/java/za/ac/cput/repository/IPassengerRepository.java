package za.ac.cput.repository;

import za.ac.cput.domain.Passenger;
import java.util.List;

public interface IPassengerRepository extends IRepository<Passenger, String>{
    List<Passenger> getAll(); //returns Passenger objects in a list
}




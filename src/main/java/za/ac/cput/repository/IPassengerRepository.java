package za.ac.cput.repository;

/*  IPassengerRepository.java
    Interface Passenger repository class
    Author: Kelsey-Jane Fabe (220328293)
    Date: 23/03/2025
*/

import za.ac.cput.domain.Passenger;
import java.util.List;

public interface IPassengerRepository extends IRepository<Passenger, String>{
    List<Passenger> getAll(); //returns Passenger objects in a list
}




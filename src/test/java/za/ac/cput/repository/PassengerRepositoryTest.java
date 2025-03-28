package za.ac.cput.repository;

/*  PassengerRepositoryTest.java
    Passenger repository test class
    Author: Kelsey-Jane Fabe (220328293)
    Date: 27/03/2025
*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.BankDetails;
import za.ac.cput.domain.Passenger;
import za.ac.cput.factory.PassengerFactory;

import static org.junit.jupiter.api.Assertions.*;

class PassengerRepositoryTest {
    private BankDetails bankdetails;
    private PassengerRepository passengerRepository;
    private Passenger passenger1, passenger2;

    @BeforeEach
    void setUp() {
        bankdetails = new BankDetails();
        passengerRepository = (PassengerRepository) PassengerRepository.getRepository();
        passenger1 = PassengerFactory.createPassengerWithAllAttributes("P001", "Amelia", "Swart",
                "0826945583", "aswart@gmail.co.za", bankdetails);
        passengerRepository.create(passenger1);
        passenger2 = PassengerFactory.createPassengerWithAllAttributes("P002", "Dino", "Gordon",
                "0721638484", "wackdino@gmail.co.za", bankdetails);
        passengerRepository.create(passenger2);
    }

    @Test
    @Order(1)
    void test_create() {
        Passenger passenger3 = PassengerFactory.createPassengerWithAllAttributes("P003", "Manny", "James",
                "0853926401", "mannyj@gmail.com", bankdetails);
        boolean passCreated = passengerRepository.create(passenger3);
        assertNotNull(passCreated);
    }

    @Test
    void test_read() {
        Passenger passRead = passengerRepository.read(passenger1.getPassid());
        assertNotNull(passRead);

    }

    @Test
    void test_update() {
        Passenger updatePassenger = PassengerFactory.createPassengerWithAllAttributes("P001","Amber", "Swart",
                "0826945583", "aswart@gmail.co.za", bankdetails);
        boolean updated = passengerRepository.update("P001", updatePassenger);
        assertTrue(updated);
        System.out.println("Passenger 1 was updated");
    }

    @Test
    void test_delete() {
        Passenger passenger3 = PassengerFactory.createPassengerWithAllAttributes("P003", "Manny", "James",
                "0853926401", "mannyj@gmail.com", bankdetails);
        assertTrue(passengerRepository.delete(passenger3.getPassid()));
        System.out.println("Success. Passenger 3 was deleted.");

    }

}
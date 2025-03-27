package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.BankDetails;
import za.ac.cput.domain.Passenger;

import static org.junit.jupiter.api.Assertions.*;

class PassengerFactoryTest {
    private BankDetails bankdetails;
    private static Passenger p1;
    private static Passenger p2;
    private static Passenger p3;

    @BeforeEach
    void setUp() {
        bankdetails = new BankDetails();
    }


    @Test
    void testCreatePassenger() {
        Passenger p1 = PassengerFactory.createPassenger("P001", "John", "Malan");
        assertNotNull(p1); //checking if object p1 is null
        System.out.println(p1.toString());
    }


    //this test needs to pass
    @Test
    void testCreatePassengerWithAllAttributes() {
        Passenger p2 = PassengerFactory.createPassengerWithAllAttributes("P002", "Ruben", "Newman",
                "0629348182", "rnewman@gmail.com", bankdetails);

        assertNotNull(p2); //checks if p2 object is not null
        assertEquals("P002", p2.getPassid());
        assertEquals("Ruben", p2.getPassName());
        assertEquals("Newman", p2.getPassSurname());
        assertEquals("0629348182", p2.getPassPhoneNum());
        assertEquals("rnewman@gmail.com", p2.getPassEmail());
        System.out.println(p2.toString());
    }

    @Test
    void testCreateFailedPassenger() {
        Passenger p3 = PassengerFactory.createPassengerWithAllAttributes("P003", "Dora", "White",
                "0827948102", "dwhite2002gmail.com", bankdetails);
        //fail();
        assertNotNull(p3); //checking if object p3 email is valid
        System.out.println(p3.toString());
    }

}
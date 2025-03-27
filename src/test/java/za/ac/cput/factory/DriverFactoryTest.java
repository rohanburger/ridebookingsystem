package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Driver;

import static org.junit.jupiter.api.Assertions.*;

/*
    DriverFactoryTest.java
    Unit tests for DriverFactory
    Author: Kyle Bowers
    Date: 22/03/2025
*/

class DriverFactoryTest {
    @Test
    void testCreateDriver_Success() {
        Driver driver = DriverFactory.createDriver(
                "D001", "kyle", "Bowers", "0812708822",
                "kylebowers60@gmail.com", "Kb60001");

        assertNotNull(driver);
        assertEquals("D001", driver.getDriverId());
        assertEquals("Kyle", driver.getDriverName());
        assertEquals("Bowers", driver.getDriverSurname());
        assertEquals("0812708822", driver.getDriverPhoneNum());
        assertEquals("kylebowers60@gmail.com", driver.getDriverEmail());
        assertEquals("Kb60001", driver.getLicenseNum());
    }

    @Test
    void testCreateDriver_Fail_NullName() {
        Driver driver = DriverFactory.createDriver(
                "D002", "", "Bowers", "0812708822",
                "kylebowers60@gmail.com", "Kb60001");

        assertNull(driver, "Driver should be null due to empty name");
    }

    @Test
    void testCreateDriver_Fail_InvalidPhoneNumber() {
        Driver driver = DriverFactory.createDriver(
                "D003", "Kyle", "Bowers", "1234",
                "kylebowers60@gmail.com", "Kb60001");

        assertNull(driver, "Driver should be null due to invalid phone number");
    }

    @Test
    void testCreateDriver_Fail_InvalidEmail() {
        Driver driver = DriverFactory.createDriver(
                "D004", "Kyle", "Bowers", "0812708822",
                "kylebowers60gmail.com", "Kb60001");

        assertNull(driver, "Driver should be null due to invalid email format");
    }

    @Test
    void testCreateDriver_Fail_InvalidLicense() {
        Driver driver = DriverFactory.createDriver(
                "D005", "John", "Doe", "1234567890",
                "john.doe@example.com", "");

        assertNull(driver, "Driver should be null due to empty license number");
    }
}
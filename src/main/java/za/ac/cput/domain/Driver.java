package za.ac.cput.domain;

/*
    Driver.java
    Driver builder Class
    Author:Kyle Bowers
    Date:22/03/2025
*/

public class Driver {
    private String driverId;
    private String driverName;
    private String driverSurname;
    private String driverPhoneNum;
    private String driverEmail;
    private String licenseNum;
    
    }

    public String getDriverId() {
        return driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getDriverSurname() {
        return driverSurname;
    }

    public String getDriverPhoneNum() {
        return driverPhoneNum;
    }

    public String getDriverEmail() {
        return driverEmail;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

            this.licenseNum = licenseNum;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId='" + driverId + '\'' +
                ", driverName='" + driverName + '\'' +
                ", driverSurname='" + driverSurname + '\'' +
                ", driverPhoneNum='" + driverPhoneNum + '\'' +
                ", driverEmail='" + driverEmail + '\'' +
                ", licenseNum='" + licenseNum + '\'' +
                '}';
    }
    }
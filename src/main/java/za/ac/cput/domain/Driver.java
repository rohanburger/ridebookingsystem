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

    public Driver(String driverId, String driverName, String driverSurname,
                  String driverPhoneNum, String driverEmail, String licenseNum) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.driverSurname = driverSurname;
        this.driverPhoneNum = driverPhoneNum;
        this.driverEmail = driverEmail;
        this.licenseNum = licenseNum;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverSurname() {
        return driverSurname;
    }

    public void setDriverSurname(String driverSurname) {
        this.driverSurname = driverSurname;
    }

    public String getDriverPhoneNum() {
        return driverPhoneNum;
    }

    public void setDriverPhoneNum(String driverPhoneNum) {
        this.driverPhoneNum = driverPhoneNum;
    }

    public String getDriverEmail() {
        return driverEmail;
    }

    public void setDriverEmail(String driverEmail) {
        this.driverEmail = driverEmail;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
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

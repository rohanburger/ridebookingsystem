package za.ac.cput.domain;
/*
    Session.java
    Session builder Class
    Author:Rohan Janzen Burger
    Date:19/03/2025
*/
public class Session {
    private Passenger passenger;
    private Driver driver;
    private Location location;
    private String passengerCount;
    private float sessionAmount;
    private String sessionStatus;

    public Session() {

    }

    public Session(Builder builder) {
        this.passenger = builder.passenger;
        this.driver = builder.driver;
        this.location = builder.location;
        this.passengerCount = builder.passengerCount;
        this.sessionStatus = builder.sessionStatus;
        this.sessionAmount = builder.sessionAmount;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getSessionStatus() {
        return sessionStatus;
    }

    public String getPassengerCount() {
        return passengerCount;
    }

    public Location getLocation() {
        return location;
    }

    public Driver getDriver() {
        return driver;
    }

    public float getSessionAmount() {
        return sessionAmount;
    }

    @Override
    public String toString() {
        return "Session{" +
                "passenger=" + passenger +
                ", driver=" + driver +
                ", location=" + location +
                ", passengerCount=" + passengerCount +
                ", sessionStatus='" + sessionStatus +
                ", sessionAmount='" + sessionAmount +
                '\'' +
                '}';
    }


    public static class Builder {
        private Passenger passenger;
        private Driver driver;
        private Location location;
        private String passengerCount;
        private String sessionStatus;
        private float sessionAmount;
        

        public Builder setPassenger(Passenger passenger) {
            this.passenger = passenger;
            return this;

        }

        public Builder setDriver(Driver driver) {
            this.driver = driver;
            return this;
        }

        public Builder setLocation(Location location) {
            this.location = location;
            return this;

        }

        public Builder setPassengerCount(String passengerCount) {
            this.passengerCount = passengerCount;
            return this;

        }


        public Builder setSessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;

        }

        public Builder setSessionAmount(float sessionAmount) {
            this.sessionAmount = sessionAmount;
            return this;
        }

        public Session build() {
            return new Session(this);
        }

    }

}

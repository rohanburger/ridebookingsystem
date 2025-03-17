package za.ac.cput.domain;

public class Session {
    private Passenger passenger;
    private Driver driver;
    private Location location;
    private int passengerCount;
    private String sessionStatus;

    public Session() {
    }

    public Session(Builder builder) {
        this.passenger = builder.passenger;
        this.driver = builder.driver;
        this.location = builder.location;
        this.passengerCount = builder.passengerCount;
        this.sessionStatus = builder.sessionStatus;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getSessionStatus() {
        return sessionStatus;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public Location getLocation() {
        return location;
    }

    public Driver getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        return "Session{" +
                "passenger=" + passenger +
                ", driver=" + driver +
                ", location=" + location +
                ", passengerCount=" + passengerCount +
                ", sessionStatus='" + sessionStatus + '\'' +
                '}';
    }

    public static class Builder {
        private Passenger passenger;
        private Driver driver;
        private Location location;
        private int passengerCount;
        private String sessionStatus;

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

        public Builder setPassengerCount(int passengerCount) {
            this.passengerCount = passengerCount;
            return this;

        }

        public Builder setSessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;

        }

        public Session build() {
            return new Session(this);
        }

    }

}

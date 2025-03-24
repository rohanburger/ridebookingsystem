package za.ac.cput.domain;

public class Location {

    private String locationId;
    private String pickupStreet;
    private String pickupSuburb;
    private String pickupCity;
    private String dropoffStreet;
    private String dropoffSuburb;
    private String dropoffCity;


    public Location(LocationBuilder builder) {
        this.locationId = builder.locationId;
        this.pickupStreet = builder.pickupStreet;
        this.pickupSuburb = builder.pickupSuburb;
        this.pickupCity = builder.pickupCity;
        this.dropoffStreet = builder.dropoffStreet;
        this.dropoffSuburb = builder.dropoffSuburb;
        this.dropoffCity = builder.dropoffCity;
    }

    public String getLocationId() {
        return locationId;
    }

    public String getPickupStreet() {
        return pickupStreet;
    }

    public String getPickupSuburb() {
        return pickupSuburb;
    }

    public String getPickupCity() {
        return pickupCity;
    }

    public String getDropoffStreet() {
        return dropoffStreet;
    }

    public String getDropoffSuburb() {
        return dropoffSuburb;
    }

    public String getDropoffCity() {
        return dropoffCity;
    }

    public String pickupDetails() {
        return pickupStreet + " " + pickupSuburb + " " + pickupCity;
    }
    public String dropoffDetails() {
        return dropoffStreet + " " + dropoffSuburb + " " + dropoffCity;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationId='" + locationId + '\'' +
                ", pickupStreet='" + pickupStreet + '\'' +
                ", pickupSuburb='" + pickupSuburb + '\'' +
                ", pickupCity='" + pickupCity + '\'' +
                ", dropoffStreet='" + dropoffStreet + '\'' +
                ", dropoffSuburb='" + dropoffSuburb + '\'' +
                ", dropoffCity='" + dropoffCity + '\'' +
                '}';
    }

    public static class LocationBuilder{
        private String locationId;
        private String pickupStreet;
        private String pickupSuburb;
        private String pickupCity;
        private String dropoffStreet;
        private String dropoffSuburb;
        private String dropoffCity;

        public LocationBuilder setLocationId(String locationId) {
            this.locationId = locationId;
            return this;
        }

        public LocationBuilder setPickupStreet(String pickupStreet) {
            this.pickupStreet = pickupStreet;
            return this;
        }

        public LocationBuilder setPickupSuburb(String pickupSuburb) {
            this.pickupSuburb = pickupSuburb;
            return this;
        }

        public LocationBuilder setPickupCity(String pickupCity) {
            this.pickupCity = pickupCity;
            return this;
        }

        public LocationBuilder setDropoffStreet(String dropoffStreet) {
            this.dropoffStreet = dropoffStreet;
            return this;
        }

        public LocationBuilder setDropoffSuburb(String dropoffSuburb) {
            this.dropoffSuburb = dropoffSuburb;
            return this;
        }

        public LocationBuilder setDropoffCity(String dropoffCity) {
            this.dropoffCity = dropoffCity;
            return this;
        }

        public Location build() {
            return new Location(this);
        }
    }
}

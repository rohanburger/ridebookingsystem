package za.ac.cput.domain;

/*  Passenger.java
    Passenger builder class
    Author: Kelsey-Jane Fabe
    Date: 20/03/2025
*/

public class Passenger {
    private String passid;
    private String passName;
    private String passSurname;
    private String passPhoneNum;
    private String passEmail;
    private BankDetails bankdetails;

    public Passenger() {
    }

    private Passenger(PassengerBuilder builder) {
        this.passid = builder.passid;
        this.passName = builder.passName;
        this.passSurname = builder.passSurname;
        this.passPhoneNum = builder.passPhoneNum;
        this.passEmail = builder.passEmail;
        this.bankdetails = builder.bankdetails;
    }

    public String getPassid() {
        return passid;
    }

    public String getPassName() {
        return passName;
    }

    public String getPassSurname() {
        return passSurname;
    }

    public String getPassPhoneNum() {
        return passPhoneNum;
    }

    public String getPassEmail() {
        return passEmail;
    }

    public BankDetails getBankdetails() {
        return bankdetails;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passid='" + passid + '\'' +
                ", passName='" + passName + '\'' +
                ", passSurname='" + passSurname + '\'' +
                ", passPhoneNum='" + passPhoneNum + '\'' +
                ", passEmail='" + passEmail +
                ", bankdetails=" + bankdetails +
                '}';
    }

    public static class PassengerBuilder {
        private String passid;
        private String passName;
        private String passSurname;
        private String passPhoneNum;
        private String passEmail;
        private BankDetails bankdetails;

        //return builder objects
        public PassengerBuilder setPassid(String passid) {
            this.passid = passid;
            return this;
        }

        public PassengerBuilder setPassName(String passName) {
            this.passName = passName;
            return this;
        }

        public PassengerBuilder setPassSurname(String passSurname) {
            this.passSurname = passSurname;
            return this;
        }

        public PassengerBuilder setPassPhoneNum(String passPhoneNum) {
            this.passPhoneNum = passPhoneNum;
            return this;
        }

        public PassengerBuilder setPassEmail(String passEmail) {
            this.passEmail = passEmail;
            return this;
        }

        public PassengerBuilder setBankdetails(BankDetails bankdetails) {
            this.bankdetails = bankdetails;
            return this;
        }

        public Passenger build() {
            return new Passenger(this);
        }
    }
}

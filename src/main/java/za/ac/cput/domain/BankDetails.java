package za.ac.cput.domain;

/*
    BankDetails.java
    Bank Details Class
    Author: Romano Deon Christians
    Date:21/03/2025
*/

public class BankDetails {
    private String bankCardNum;
    private String bankCardDate;
    private String bankCardCVV;


    public BankDetails (Builder builder) {
        this.bankCardNum = builder.bankCardNum;
        this.bankCardDate =builder.bankCardDate;
        this.bankCardCVV = builder.bankCardCVV;
    }

    public String getBankCardNum() {
        return bankCardNum;
    }

    public String getBankCardDate() {
        return bankCardDate;
    }

    public String getBankCardCVV() {
        return bankCardCVV;
    }

    @Override
    public String toString(){
        return "BankDetails{" +
            "bankCardNum='" + bankCardNum + '\'' +
            ", bankCardDate='" + bankCardDate + '\'' +
            ", bankCardCVV='" + bankCardCVV + '\'' +
            '}';
    }

    public static class Builder {
        private String bankCardNum;
        private String bankCardDate;
        private String bankCardCVV;

        public Builder setBankCardNum(String bankCardNum) {
            this.bankCardNum = bankCardNum;
            return this;
        }

        public Builder setBankCardDate(String bankCardDate) {
            this.bankCardDate = bankCardDate;
            return this;
        }

        public Builder setBankCardCVV(String bankCardCVV) {
            this.bankCardCVV = bankCardCVV;
            return this;
        }

        public BankDetails build() {
            return new BankDetails(this);
        }
    }
}

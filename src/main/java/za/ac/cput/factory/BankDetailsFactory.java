package za.ac.cput.factory;

/*
    Factory.java
    Factory Class
    Author: Romano Deon Christians
    Date:21/03/2025
*/


import za.ac.cput.domain.BankDetails;
import za.ac.cput.helper.BankDetailsHelper;

public class BankDetailsFactory {
    public static BankDetails createBankDetails(String bankCardNum, String bankCardDate, String bankCardCVV) {
        if (BankDetailsHelper.isNullOrEmpty(bankCardNum) ||
                BankDetailsHelper.isNullOrEmpty(bankCardDate) ||
                BankDetailsHelper.isNullOrEmpty(bankCardCVV)) {
            System.out.println("Error: One or more fields are empty or null");
            return null;
        }
        return new BankDetails.Builder()
                .setBankCardNum(bankCardNum)
                .setBankCardDate(bankCardDate)
                .setBankCardCVV(bankCardCVV)
                .build();
    }
}

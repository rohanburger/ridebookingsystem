
public class BankDetails {
    private String bankCardNum;
    private String bankCardDate;
    private String bankCardCVV;


    public BankDetails (String bankCardNum, String bankCardDate, String bankCardCVV) {
        this.bankCardNum = bankCardNum;
        this.bankCardDate = bankCardDate;
        this.bankCardCVV = bankCardCVV;
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
}

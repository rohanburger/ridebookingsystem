package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.BankDetails;

import static org.junit.jupiter.api.Assertions.*;

class BankDetailsFactoryTest {

    @Test
    void testCreateBankDetails_Success() {
        BankDetails bankDetails = BankDetailsFactory.createBankDetails("0538478240596748", "08/29", "710");
        assertNotNull(bankDetails);
        assertEquals("0538478240596748", bankDetails.getBankCardNum());
        assertEquals("08/29", bankDetails.getBankCardDate());
        assertEquals("710", bankDetails.getBankCardCVV());
    }

    @Test
    void testCreateBankDetails_Fail_NullValues() {
        BankDetails bankDetails = BankDetailsFactory.createBankDetails(null, "08/29", "710");
        assertNull(bankDetails);

        bankDetails = BankDetailsFactory.createBankDetails("0538478240596748", null, "710");
        assertNull(bankDetails);

        bankDetails = BankDetailsFactory.createBankDetails("0538478240596748", "08/29", null);
        assertNull(bankDetails);
    }

    @Test
    void testCreateBankDetails_Fail_EmptyValues() {
        BankDetails bankDetails = BankDetailsFactory.createBankDetails("", "08/29", "710");
        assertNull(bankDetails);

        bankDetails = BankDetailsFactory.createBankDetails("0538478240596748", "", "710");
        assertNull(bankDetails);

        bankDetails = BankDetailsFactory.createBankDetails("0538478240596748", "08/29", "");
        assertNull(bankDetails);
    }
}

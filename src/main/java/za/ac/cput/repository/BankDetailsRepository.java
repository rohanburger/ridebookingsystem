package za.ac.cput.repository;

/*
    BankDetailsRepository.java
    Repository Implementation
    Author: Romano Deon Christians
    Date: 27/03/2025
*/

import za.ac.cput.domain.BankDetails;
import java.util.HashSet;
import java.util.Set;

public class BankDetailsRepository implements IBankDetailsRepository {
    private static BankDetailsRepository repository = null;
    private Set<BankDetails> bankDetailsSet;

    private BankDetailsRepository() {
        this.bankDetailsSet = new HashSet<>();
    }

    public static BankDetailsRepository getRepository() {
        if (repository == null) {
            repository = new BankDetailsRepository();
        }
        return repository;
    }

    @Override
    public BankDetails create(BankDetails bankDetails) {
        if (bankDetailsSet.add(bankDetails)) {
            return bankDetails;
        }
        return null;
    }

    @Override
    public BankDetails read(String bankCardNum) {
        return bankDetailsSet.stream()
                .filter(bd -> bd.getBankCardNum().equals(bankCardNum))
                .findFirst()
                .orElse(null);
    }

    @Override
    public BankDetails update(BankDetails bankDetails) {
        BankDetails existing = read(bankDetails.getBankCardNum());
        if (existing != null) {
            bankDetailsSet.remove(existing);
            bankDetailsSet.add(bankDetails);
            return bankDetails;
        }
        return null;
    }

    @Override
    public boolean delete(String bankCardNum) {
        BankDetails bankDetails = read(bankCardNum);
        if (bankDetails != null) {
            return bankDetailsSet.remove(bankDetails);
        }
        return false;
    }

    @Override
    public Set<BankDetails> getAll() {
        return bankDetailsSet;
    }
}

package za.ac.cput.repository;

/*
IBankDetailsRepository.java
Repository Class
Author: Romano Deon Christians
Date:27/03/2025
        */
import za.ac.cput.domain.BankDetails;
import java.util.HashSet;
import java.util.Set;

interface  IBankDetailsRepository {
    BankDetails create(BankDetails bankDetails);
    BankDetails read(String bankCardNum);
    BankDetails update(BankDetails bankDetails);
    boolean delete(String bankCardNum);
    Set <BankDetails> getAll();
}
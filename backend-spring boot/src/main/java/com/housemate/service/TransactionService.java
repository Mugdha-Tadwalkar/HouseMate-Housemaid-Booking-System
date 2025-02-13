package com.housemate.service;

import java.util.List;

import com.housemate.model.Order;
import com.housemate.model.Seller;
import com.housemate.model.Transaction;
import com.housemate.model.User;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionBySeller(Seller seller);
    List<Transaction>getAllTransactions();
}

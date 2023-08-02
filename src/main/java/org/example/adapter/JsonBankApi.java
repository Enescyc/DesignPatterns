package org.example.adapter;

public class JsonBankApi implements IBankApi{

    @Override
    public void executeTransaction(Transaction transaction) {
        System.out.println("Executing JsonBankApi transaction...");
    }
}

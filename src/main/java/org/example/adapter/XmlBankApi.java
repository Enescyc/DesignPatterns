package org.example.adapter;

public class XmlBankApi implements IBankApi{

    @Override
    public void executeTransaction(Transaction transaction) {
        System.out.println("Executing XML Bank Api transaction");
    }
}

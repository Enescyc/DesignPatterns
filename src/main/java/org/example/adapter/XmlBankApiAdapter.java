package org.example.adapter;

public class XmlBankApiAdapter implements IBankApi {

    private final XmlBankApi xmlBankApi;

    public XmlBankApiAdapter(XmlBankApi xmlBankApi){
        this.xmlBankApi = xmlBankApi;
    }
    @Override
    public void executeTransaction(Transaction transaction) {
        System.out.println("Do something before xml execute transaction");
        this.xmlBankApi.executeTransaction(transaction);

    }
}

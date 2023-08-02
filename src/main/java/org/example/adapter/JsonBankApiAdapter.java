package org.example.adapter;

public class JsonBankApiAdapter implements IBankApi {
    private final JsonBankApi jsonBankApi;

    public JsonBankApiAdapter(JsonBankApi jsonBankApi) {
        this.jsonBankApi = jsonBankApi;
    }

    @Override
    public void executeTransaction(Transaction transaction) {
        System.out.println("Do something before json execute transaction");
        this.jsonBankApi.executeTransaction(transaction);
    }
}

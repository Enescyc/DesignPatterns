package org.example.strategy;

public class YapiKrediPaymentService implements IPaymentService {

    @Override()
    public void pay(PaymentOptions paymentOptions) {
        System.out.println("Yapi Kredi bankası ile " + paymentOptions.getAmount() + "TL lik ödeme yapıldı");
    }
}

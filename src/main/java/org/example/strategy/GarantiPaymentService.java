package org.example.strategy;

public class GarantiPaymentService implements IPaymentService {

    @Override()
    public void pay(PaymentOptions paymentOption) {
        System.out.println("Garanti bankası ile " + paymentOption.getAmount() + "TL lik ödeme yapıldı");
    }

}

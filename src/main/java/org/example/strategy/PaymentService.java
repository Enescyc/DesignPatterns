package org.example.strategy;

public class PaymentService implements IPaymentService {

    private IPaymentService paymentService = null;

    public PaymentService(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public PaymentService() {
    }

    @Override()
    public void pay(PaymentOptions paymentOptions) {
        this.paymentService.pay(paymentOptions);
    }

    public void setPaymentService(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }
}

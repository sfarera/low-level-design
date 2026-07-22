package design_patterns.structural.adapter;

import design_patterns.structural.adapter.external.PayUPayAPI;
import design_patterns.structural.adapter.external.PayUStatus;

import static design_patterns.structural.adapter.PaymentStatus.DONE;
import static design_patterns.structural.adapter.PaymentStatus.FAILED;
import static design_patterns.structural.adapter.external.RazorPayStatus.ERROR;

public class PayUAdapter implements PaymentProvider{

    PayUPayAPI payUPayAPI = new PayUPayAPI();
    @Override
    public void createPayment(Long id, String name, String email, Double amount) {
        payUPayAPI.makePayment(id, amount);
    }

    @Override
    public PaymentStatus verifyStatus(Long id) {
        return to(payUPayAPI.getStatus(id));
    }
    private PaymentStatus to(PayUStatus payUStatus){
        switch(payUStatus){
            case SUCCESS : return DONE;
            case FAILURE : return FAILED;
        }
       throw new IllegalArgumentException("Invalid status : "+payUStatus);
    }
}

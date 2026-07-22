package design_patterns.structural.adapter;

import design_patterns.structural.adapter.external.RazorPayAPI;
import design_patterns.structural.adapter.external.RazorPayStatus;

import static design_patterns.structural.adapter.PaymentStatus.DONE;
import static design_patterns.structural.adapter.PaymentStatus.FAILED;

public class RazorPayAdapter implements PaymentProvider{

    private RazorPayAPI razorPayAPI = new RazorPayAPI();
    @Override
    public void createPayment(Long id, String name, String email, Double amount) {
        razorPayAPI.pay(id, name, email, amount);
    }

    @Override
    public PaymentStatus verifyStatus(Long id) {
        return to(razorPayAPI.checkStatus(id));
    }

    private PaymentStatus to(RazorPayStatus razorPayStatus){

        switch (razorPayStatus) {
            case OK : return DONE;
            case ERROR: return FAILED;
        }
        throw new IllegalArgumentException("Invalid status "+razorPayStatus);
    }
}

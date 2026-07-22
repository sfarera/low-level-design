package design_patterns.structural.adapter;

public interface PaymentProvider {

    void createPayment(Long id, String name, String email, Double amount);
    PaymentStatus verifyStatus(Long id);
}

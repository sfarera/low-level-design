package design_patterns.structural.adapter.external;
//SDK
// Step 0 : External API
public class PayUPayAPI {

    public void makePayment(Long id,  Double amount){
        System.out.println("Pay U Payment");
    }
    public PayUStatus getStatus(Long id){
        return PayUStatus.SUCCESS;
    }
}

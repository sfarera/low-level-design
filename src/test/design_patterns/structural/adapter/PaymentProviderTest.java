package design_patterns.structural.adapter;

import org.junit.Assert;
import org.junit.Test;

public class PaymentProviderTest {
// you just have to change the adapter to change the payment gateway.
   // PaymentProvider adapter = new RazorPayAdapter();
PaymentProvider adapter = new PayUAdapter();

    @Test
    public void testPayMethod(){
        /* If you were not using the adapter pattern
        your code would look like below:
        if (paymentGateway=='RazorPay'){
        RazorPayApi.pay();
        RazorPayStatus status = RazorPayStatus.OK;
        }
 else if (paymentGateway=='PayU'){
 PayUApi.makePayment();
 PayUStatus status = PayUStatus.SUCCESS;
 you are using razpr pay or payu's api directly.
        * */

        adapter.createPayment(1L, "John Doe", "j@d",100.0);


    }
    @Test
    public void testStatus(){
        PaymentStatus status = adapter.verifyStatus(1L);
        Assert.assertEquals("If status is fetched, it should be DONE",PaymentStatus.DONE,status);
    }
}

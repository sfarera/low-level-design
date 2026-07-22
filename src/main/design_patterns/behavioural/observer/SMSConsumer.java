package design_patterns.behavioural.observer;

public class SMSConsumer implements Consumer{
    @Override
    public void consume(Double price) {
        System.out.println("Sendinf sms for price : "+price);
    }
}

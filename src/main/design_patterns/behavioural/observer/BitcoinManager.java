package design_patterns.behavioural.observer;

//Step 2 : Extend the publisher class
// Benefit : Concrete class decides to publish not the abstract class.
public class BitcoinManager extends Publisher{
    private Bitcoin bitcoin;

    public void setPrice(Double price){

        if (bitcoin.getPrice() - price > 5.0 ){
        publish(price);
    }bitcoin.setPrice(price);
    }
}

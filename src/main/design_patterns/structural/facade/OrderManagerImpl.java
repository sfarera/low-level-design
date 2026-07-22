package design_patterns.structural.facade;

public class OrderManagerImpl implements OrderManager{
    // This class may keep growing and will have a lot of dependencies

    OrderProcessor orderProcessor = new OrderProcessorImpl();
    @Override
    public void checkOut(Long orderId) {

        orderProcessor.process(orderId);

    }
}

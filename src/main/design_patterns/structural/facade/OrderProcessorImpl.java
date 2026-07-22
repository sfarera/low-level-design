package design_patterns.structural.facade;

public class OrderProcessorImpl implements OrderProcessor{

    private InventoryService inventoryService;

    private PaymentService paymentService;

    private InvoiceService invoiceService;
    @Override
    public void process(Long orderId) {


        if (!inventoryService.isPresent(orderId)){
            throw new RuntimeException("Stock not present");
        }
        // Payment Gateway

        paymentService.processPayment(orderId);

        // Create an invoice
        invoiceService.generateInvoice(orderId);

        // Send an email

    }
}

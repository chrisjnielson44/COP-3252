// Test App InvoiceTest
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("123", "Screwdriver", 5, 12.99);

        // print invoice details
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: " + invoice.getPricePerItem());
        System.out.println("Invoice amount: " + invoice.getInvoiceAmount());

        // update the quantity and price per item - shows that quantity and price can be changed
        invoice.setQuantity(10);
        invoice.setPricePerItem(15.99);

        // print updated invoice details
        System.out.println("\nUpdated Invoice details:");
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: " + invoice.getPricePerItem());
        System.out.println("Invoice amount: " + invoice.getInvoiceAmount());
    }
}




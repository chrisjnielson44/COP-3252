// Class Invoice
class Invoice {
    // instance variables
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // constructor to initialize instance variables
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        // set quantity to 0 if not positive
        this.quantity = (quantity > 0) ? quantity : 0;
        // set pricePerItem to 0.0 if not positive
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
    }

    // set and get methods for each instance variable
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {
        // set quantity to 0 if not positive
        this.quantity = (quantity > 0) ? quantity : 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        // set pricePerItem to 0.0 if not positive
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    // method to calculate invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

public class Order {
    private String customerName;
    private double orderAmount;
    
    // Temporary field, only used in specific cases
    private String specialInstructions;

    public Order(String customerName, double orderAmount) {
        this.customerName = customerName;
        this.orderAmount = orderAmount;
    }

    // Method to add special instructions (only used in rare cases)
    public void addSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    // Method to print order details
    public void printOrderDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Amount: $" + orderAmount);
        if (specialInstructions != null) {
            System.out.println("Special Instructions: " + specialInstructions);
        }
    }
}
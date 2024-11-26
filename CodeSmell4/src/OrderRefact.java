public class OrderRefact {
  private String customerName;
  private double orderAmount;

  OrderRefact(String customerName, double orderAmount) {
    this.customerName = customerName;
    this.orderAmount = orderAmount;
  }

  public void printOrderDetails() {
    System.out.println("Customer: " + customerName);
    System.out.println("Amount: $" + orderAmount);
  }
}

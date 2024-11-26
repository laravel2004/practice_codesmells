public class SpecialOrder extends Order {
  private String specialInstructions;

  public SpecialOrder(String customerName, double orderAmount, String specialInstructions) {
      super(customerName, orderAmount);
      this.specialInstructions = specialInstructions;
  }

  @Override
  public void printOrderDetails() {
      super.printOrderDetails();
      System.out.println("Special Instructions: " + specialInstructions);
  }
}
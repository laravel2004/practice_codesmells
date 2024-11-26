public class PaypalPayment implements PaymentMethod {
  @Override
  public double calculateFee(double amount) {
      return 0.03 * amount;
  }

  @Override
  public void processPayment() {
      System.out.println("Processing PayPal payment...");
  }
}

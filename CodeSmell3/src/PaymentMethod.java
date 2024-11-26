public interface PaymentMethod {
  double calculateFee(double amount);
  void processPayment();
}

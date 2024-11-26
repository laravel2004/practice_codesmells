import java.util.HashMap;
import java.util.Map;

public class PaymentProcessorRefact {
  private final Map<String, PaymentMethod> paymentMethods;

  public PaymentProcessorRefact() {
    paymentMethods = new HashMap<>();
    paymentMethods.put("creditCard", new CreditCardPayment());
    paymentMethods.put("paypal", new PaypalPayment());
    paymentMethods.put("bankTransfer", new BankTransferPayment());
  }

  public double processPayment(String paymentMethod, double amount) {
    PaymentMethod method = paymentMethods.get(paymentMethod);

    if (method == null) {
        System.out.println("Unknown payment method.");
        return amount;
    }

    method.processPayment();
    double fee = method.calculateFee(amount);
    return amount + fee;
  }
}

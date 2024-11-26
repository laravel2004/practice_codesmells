public class PaymentProcessor {
    public double processPayment(String paymentMethod, double amount) {
        double fee = 0.0;

        switch (paymentMethod) {
            case "creditCard":
                fee = 0.02 * amount; // 2% fee for credit card
                System.out.println("Processing credit card payment...");
                break;
            case "paypal":
                fee = 0.03 * amount; // 3% fee for PayPal
                System.out.println("Processing PayPal payment...");
                break;
            case "bankTransfer":
                fee = 0.01 * amount; // 1% fee for bank transfer
                System.out.println("Processing bank transfer...");
                break;
            default:
                System.out.println("Unknown payment method.");
                break;
        }

        return amount + fee;
    }
}

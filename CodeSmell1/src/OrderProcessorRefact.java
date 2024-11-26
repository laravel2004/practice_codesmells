import java.util.List;

public class OrderProcessorRefact {
  private OrderModel orderModel;

  public OrderProcessorRefact(OrderModel orderModel) {
    this.orderModel = orderModel;
  }

  public void processOrder(OrderModel orderModel) {
    double finalPrice = orderModel.totalPrice + orderModel.tax;

    validateOrder(orderModel);

    if (orderModel.discountCode != null && !orderModel.discountCode.isEmpty()) {
      finalPrice -= applyDiscount(orderModel.discountCode, orderModel.totalPrice);
    }

    saveOrder(orderModel);

    sendNotification(orderModel.customerPhone, orderModel.customerName, "Pesanan Anda telah diproses dengan total: " + finalPrice);
  }

  private void validateOrder(OrderModel orderModel) {
    if (orderModel.orderId == null || orderModel.customerName == null || orderModel.customerPhone == null || orderModel.menuItems == null || orderModel.totalPrice <= 0) {
      System.out.println("Pesanan tidak valid");
      return;
    }
  }

  private double applyDiscount(String discountCode, double totalPrice) {
    DiscountCode discount = DiscountCode.from(discountCode);
    return discount.apply(totalPrice);
  }

  private void saveOrder(OrderModel orderModel) {      
    System.out.println("Pesanan disimpan ke database: " + orderModel.orderId);
  }

  private void sendNotification(String phoneNumber, String customerName, String message) {
    System.out.println("Mengirim pesan ke " + phoneNumber + ": " + message);
  }

}

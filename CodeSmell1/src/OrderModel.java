import java.util.List;

public class OrderModel {
  public String orderId;
  public String customerName;
  public String customerPhone;
  public String customerAddress;
  public List<String> menuItems;
  public double totalPrice;
  public double tax;
  public String paymentMethod;
  public String discountCode;

  OrderModel(String orderId, String customerName, String customerPhone, String customerAddress, List<String> menuItems, double totalPrice, double tax, String paymentMethod, String discountCode) {
    this.orderId = orderId;
    this.customerName = customerName;
    this.customerPhone = customerPhone;
    this.customerAddress = customerAddress;
    this.menuItems = menuItems;
    this.totalPrice = totalPrice;
    this.tax = tax;
    this.paymentMethod = paymentMethod;
    this.discountCode = discountCode;
  }

}

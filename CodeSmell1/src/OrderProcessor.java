import java.util.List;

public class OrderProcessor {
    private String orderId;
    private String customerName;
    private String customerPhone;
    private String customerAddress;
    private List<String> menuItems;
    private double totalPrice;
    private double tax;
    private String paymentMethod;
    private String discountCode;

    // Method untuk memproses pesanan
    public void processOrder(String orderId, String customerName, String customerPhone, String customerAddress, List<String> menuItems, double totalPrice, double tax, String paymentMethod, String discountCode) {
        // Proses validasi pesanan
        if (orderId == null || customerName == null || customerPhone == null || menuItems == null || totalPrice <= 0) {
            System.out.println("Pesanan tidak valid");
            return;
        }
        
        // Kalkulasi total harga dan pajak
        double finalPrice = totalPrice + tax;
        if (discountCode != null && !discountCode.isEmpty()) {
            finalPrice -= applyDiscount(discountCode, totalPrice);
        }
        
        // Menyimpan pesanan
        saveOrder(orderId, customerName, customerPhone, customerAddress, menuItems, finalPrice, paymentMethod);

        // Mengirimkan notifikasi
        sendNotification(customerPhone, customerName, "Pesanan Anda telah diproses dengan total: " + finalPrice);
    }

    private double applyDiscount(String discountCode, double totalPrice) {
        
        if (discountCode.equals("DISC10")) {
            return totalPrice * 0.10;
        } else if (discountCode.equals("DISC20")) {
            return totalPrice * 0.20;
        } else {
            return 0;
        }
    }

    private void saveOrder(String orderId, String customerName, String customerPhone, String customerAddress, List<String> menuItems, double finalPrice, String paymentMethod) {
        
        System.out.println("Pesanan disimpan ke database: " + orderId);
    }

    private void sendNotification(String phoneNumber, String customerName, String message) {
        
        System.out.println("Mengirim pesan ke " + phoneNumber + ": " + message);
    }
}

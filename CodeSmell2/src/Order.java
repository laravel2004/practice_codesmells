public class Order {
  public String customerName;
  public String customerPhone;
  public String customerEmail;
  public String movieTitle;
  public String movieDate;
  public String movieTime;
  public String seatNumber;

  public Order(String customerName, String customerPhone, String customerEmail, String movieTitle, String movieDate, String movieTime, String seatNumber) {
    this.customerName = customerName;
    this.customerPhone = customerPhone;
    this.customerEmail = customerEmail;
    this.movieTitle = movieTitle;
    this.movieDate = movieDate;
    this.movieTime = movieTime;
    this.seatNumber = seatNumber;
  }
}

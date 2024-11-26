public class TicketBookingRefact {
  public void bookTicket(Order order) {
    System.out.println("Memproses pemesanan tiket...");
    printCustomerAndFilm(order);
    System.out.println("Pesanan selesai.");
  }

  public void cancelTicket(Order order) {
    System.out.println("Memproses pembatalan tiket...");
    printCustomerAndFilm(order);
    System.out.println("Pesanan dibatalkan.");
  }

  public void rescheduleTicket(Order order, String newMovieDate, String newMovieTime) {
    System.out.println("Memproses penggantian jadwal tiket...");
    printCustomerAndFilm(order);
    System.out.println("Jadwal lama: " + order.movieDate + " jam " + order.movieTime);
    System.out.println("Jadwal baru: " + newMovieDate + " jam " + newMovieTime);
    System.out.println("Jadwal berhasil diganti.");
  }

  private void printCustomerAndFilm(Order order) {
    System.out.println("Pelanggan: " + order.customerName + ", " + order.customerPhone + ", " + order.customerEmail);
        System.out.println("Film: " + order.movieTitle + " pada " + order.movieDate + " jam " + order.movieTime);
        System.out.println("Kursi: " + order.seatNumber);
  }
}

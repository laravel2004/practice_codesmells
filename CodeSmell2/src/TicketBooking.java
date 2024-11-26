public class TicketBooking {
    
    // Method untuk melakukan booking tiket bioskop
    public void bookTicket(String customerName, String customerPhone, String customerEmail, 
                           String movieTitle, String movieDate, String movieTime, 
                           String seatNumber) {
                            
        // Simulasi pemrosesan pemesanan tiket
        System.out.println("Memproses pemesanan tiket...");
        System.out.println("Pelanggan: " + customerName + ", " + customerPhone + ", " + customerEmail);
        System.out.println("Film: " + movieTitle + " pada " + movieDate + " jam " + movieTime);
        System.out.println("Kursi: " + seatNumber);
        System.out.println("Pesanan selesai.");
    }

    // Method untuk membatalkan tiket yang sudah dipesan
    public void cancelTicket(String customerName, String customerPhone, String customerEmail, 
                             String movieTitle, String movieDate, String movieTime, 
                             String seatNumber) {
        // Simulasi pembatalan pemesanan tiket
        System.out.println("Memproses pembatalan tiket...");
        System.out.println("Pelanggan: " + customerName + ", " + customerPhone + ", " + customerEmail);
        System.out.println("Film: " + movieTitle + " pada " + movieDate + " jam " + movieTime);
        System.out.println("Kursi: " + seatNumber);
        System.out.println("Pesanan dibatalkan.");
    }
    
    // Method untuk mengganti jadwal tiket
    public void rescheduleTicket(String customerName, String customerPhone, String customerEmail, 
                                 String movieTitle, String oldMovieDate, String oldMovieTime, 
                                 String newMovieDate, String newMovieTime, 
                                 String seatNumber) {
        // Simulasi penggantian jadwal tiket
        System.out.println("Memproses penggantian jadwal tiket...");
        System.out.println("Pelanggan: " + customerName + ", " + customerPhone + ", " + customerEmail);
        System.out.println("Film: " + movieTitle);
        System.out.println("Jadwal lama: " + oldMovieDate + " jam " + oldMovieTime);
        System.out.println("Jadwal baru: " + newMovieDate + " jam " + newMovieTime);
        System.out.println("Kursi: " + seatNumber);
        System.out.println("Jadwal berhasil diganti.");
    }
}

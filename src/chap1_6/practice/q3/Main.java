package chap1_6.practice.q3;

public class Main {
    public static void main(String[] args) {

        MovieTicket ticket1 = new MovieTicket("글래이에이터2", "G12");
        MovieTicket ticket2 = new MovieTicket("글래이에이터2", "C8");
        MovieTicket ticket3 = new MovieTicket("글래이에이터2", "T4");

        ticket1.cancelBooking();
        ticket2.bookSeat();
        ticket2.bookSeat();
        ticket3.bookSeat();
        ticket3.cancelBooking();
        ticket3.cancelBooking();

        ticket1.displayTicketInfo();
        ticket2.displayTicketInfo();
    }
}

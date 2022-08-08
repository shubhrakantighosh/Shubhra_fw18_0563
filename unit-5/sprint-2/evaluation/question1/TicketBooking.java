package question1;

public class TicketBooking {
    TicketCounter ticketCounter;
    String passengerName;
    int noOfSeatsToBook;

    public void Ticket() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(noOfSeatsToBook+" the number of seats booked "+" & Passenger name is "+passengerName);
    }

}


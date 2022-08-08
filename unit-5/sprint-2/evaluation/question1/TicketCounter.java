package question1;


public class TicketCounter {
    int availableSeats = 3;

    void bookSeat(String name, int numberOfSeats) throws NoSeatAvailableException, InterruptedException {
        if (availableSeats>=numberOfSeats){
            TicketBooking ticketBooking=new TicketBooking();
//              System.out.println(numberOfSeats+" the number of seats booked "+"& available is "+availableSeats);
            ticketBooking.noOfSeatsToBook=numberOfSeats;
            ticketBooking.passengerName=name;
            ticketBooking.Ticket();
            availableSeats=availableSeats-numberOfSeats;
        }else throw new NoSeatAvailableException("No Seat Available");
    }

    public static void main(String[] args) {
        TicketCounter ticketCounter=new TicketCounter();
        try {
            ticketCounter.bookSeat("Name1",1);
            ticketCounter.bookSeat("Name2",2);
            ticketCounter.bookSeat("Name3",4);
        } catch (NoSeatAvailableException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

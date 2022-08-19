// package question3;
import java.util.Scanner;


public class Ticket {

    int ticketid;
    int price;
    static int availableTickets;

    public int calculateTicketCost(int nooftickets){
        int totalPrice=0;

        if(availableTickets>nooftickets){

            totalPrice=nooftickets*price;

        }else totalPrice=-1;

        return totalPrice;
    }

    public static void main(String[] args) {

        Ticket ticket=new Ticket();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter no of bookings");

        try {

            int noOfBookings=scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter the available tickets");
            int userAvailableTickets=scanner.nextInt();

            scanner.nextLine();
            availableTickets=userAvailableTickets;

            for(int i=0;i<noOfBookings;i++){
                System.out.println("Enter the ticketid:");
                int userTicketId=scanner.nextInt();

                scanner.nextLine();
                ticket.ticketid=userTicketId;

                System.out.println("Enter the price:");
                int userPrice=scanner.nextInt();

                scanner.nextLine();
                ticket.price=userPrice;

                System.out.println("Enter the no of tickets:");
                int nooftickets=scanner.nextInt();

                scanner.nextLine();
                int ticketCost=ticket.calculateTicketCost(nooftickets);

                System.out.println("Available tickets: "+availableTickets);

                if(ticketCost==-1){

                    System.out.println("Tickets are not available");
                    break;

                }else {

                    System.out.println("Total amount: "+ticketCost);
                    availableTickets=availableTickets-nooftickets;
                    System.out.println("Available ticket after booking: "+availableTickets);

                }
            }

        }catch (Exception e){

            System.out.println("Please Enter Valid Input");

        }

    }

}

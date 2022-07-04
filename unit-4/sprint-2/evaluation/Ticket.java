import java.util.Scanner;

public class Ticket {
    int ticketid;
    int price;
    static int availableTickets;

    public int calculateTicketCost(int nooftickets){
        if(availableTickets>0){
            return availableTickets-nooftickets;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Ticket s=new Ticket();
        int userTicket=s.ticketid;
        int userPrice=s.price;
        Scanner userEnter=new Scanner(System.in);
        System.out.print("Enter the available tickets: ");
        availableTickets= userEnter.nextInt();
        System.out.print("Enter the ticketid: ");
        userTicket=userEnter.nextInt();
        System.out.print("Enter the price: ");
        userPrice=userEnter.nextInt();
        System.out.print("Enter the no of tickets: ");
        int noOfTickets=userEnter.nextInt();

        int diff=s.calculateTicketCost(noOfTickets);
        System.out.println("Total amount: "+userPrice*noOfTickets );
        System.out.println("Available ticket after booking:"+diff);

    }
}

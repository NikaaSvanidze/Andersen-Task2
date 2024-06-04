import java.util.ArrayList;
import java.util.List;

public class TicketService {
    private List<Ticket> tickets;

    public TicketService() {
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public static void main(String[] args) {
        TicketService ticketService = new TicketService();

        // Empty Ticket
        Ticket emptyTicket = new Ticket(0, "", 0, 0,0 ,false, 'A', 0,150.25);
        ticketService.addTicket(emptyTicket);

        // Full Ticket
        Ticket fullTicket = new Ticket(1, "Concert Hall", 111, System.currentTimeMillis(), System.currentTimeMillis(), true, 'B', 10.5,100.25);
        ticketService.addTicket(fullTicket);

        // Limited Ticket
        Ticket limitedTicket = new Ticket("Limited Concert Hall", 122, System.currentTimeMillis());
        ticketService.addTicket(limitedTicket);


        List<Ticket> tickets = ticketService.tickets;
        for(int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            System.out.println(ticket.toString());
        }
    }
}
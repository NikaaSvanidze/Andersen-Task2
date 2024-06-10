import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TicketService {
    private List<Ticket> tickets;

    public TicketService() {
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    // Method to get tickets by event code, for the Merge Conflict.
    public List<Ticket> getTicketsByEventCode(int eventCode) {
        return tickets.stream()
                .filter(ticket -> ticket.getEventCode() == eventCode)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        TicketService ticketService = new TicketService();

        // Empty Ticket
        Ticket emptyTicket = new Ticket();
        ticketService.addTicket(emptyTicket);

        // Full Ticket
        Ticket fullTicket = new Ticket(1, "Sphear", 111, System.currentTimeMillis(), System.currentTimeMillis(), true, 'C', 10.5,100.25);
        ticketService.addTicket(fullTicket);

        // Limited Ticket
        Ticket limitedTicket = new Ticket("Sphear", 122, System.currentTimeMillis());
        ticketService.addTicket(limitedTicket);

        // Example usage of getTicketsByEventCode
        List<Ticket> eventTickets = ticketService.getTicketsByEventCode(111);
        System.out.println("Tickets with event code 111:");
        for (Ticket ticket : eventTickets) {
            System.out.println(ticket.toString());
        }

        List<Ticket> tickets = ticketService.tickets;
        for(int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            System.out.println(ticket.toString());
        }
    }
}
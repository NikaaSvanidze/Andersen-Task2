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

    private void initializeTickets() {
        for (int i = 1; i <= 10; i++) {
            tickets.add(new Ticket(i, "Event " + i, 100 + i, System.currentTimeMillis(), System.currentTimeMillis(), true, 'A', 10.0 * i, 50.0 * i));
        }

        public Ticket getTicketById(int ticketId){
            for (int i = 0; i < tickets.size(); i++) {
                Ticket ticket = tickets.get(i);
                if (ticket.id == ticketId) {
                    return ticket;
                }
            }
            return null;
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


        List<Ticket> tickets = ticketService.tickets;
        for(int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            System.out.println(ticket.toString());
        }
    }
}
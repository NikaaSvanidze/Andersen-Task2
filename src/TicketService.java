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

    public List<Ticket> getTicketsByStadiumSector(char stadiumSector) {
        return tickets.stream()
                .filter(ticket -> ticket.getStadiumSector() == stadiumSector)
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


        List<Ticket> tickets = ticketService.tickets;
        for(int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            System.out.println(ticket.toString());
        }

        // Getting tickets by Stadium Sector 'C'
        List<Ticket> sectorCTickets = ticketService.getTicketsByStadiumSector('C');
        for (Ticket ticket : sectorCTickets) {
            System.out.println(ticket.toString());
        }
    }
}
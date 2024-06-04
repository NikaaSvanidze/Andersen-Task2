import java.time.Instant;

public class Ticket {
    private int id;
    private String concertHall;
    private int eventCode;
    private long time;
    private long creationTime;
    private boolean isPromo;
    private char stadiumSector;
    private double maxAllowedBackpackWeight;
    private final double ticketPrice;

    public Ticket(int id, String concertHall, int eventCode, long time, long creationTime, boolean isPromo, char stadiumSector, double maxAllowedBackpackWeight, double ticketPrice) {
        this.id = id;
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        this.creationTime = creationTime;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.maxAllowedBackpackWeight = maxAllowedBackpackWeight;
        this.ticketPrice = ticketPrice; // Initialize ticket price
    }

    public Ticket(String concertHall, int eventCode, long time) {
        this(0, concertHall, eventCode, time, System.currentTimeMillis(), false, 'A', 0, 0);
    }

    public String toString() {
        String promoStatus = isPromo ? "Promo" : "Regular";
        String sector = Character.toString(stadiumSector);
        Instant eventInstant = Instant.ofEpochMilli(time);
        String formattedEventTime = eventInstant.toString();
        Instant creationInstant = Instant.ofEpochMilli(creationTime);
        String formattedCreationTime = creationInstant.toString();
        return "Ticket{" +
                "id='" + id + '\'' +
                ", concertHall='" + concertHall + '\'' +
                ", eventCode='" + eventCode + '\'' +
                ", eventTime='" + formattedEventTime + '\'' +
                ", creationTime='" + formattedCreationTime + '\'' +
                ", promoStatus='" + promoStatus + '\'' +
                ", stadiumSector='" + sector + '\'' +
                ", maxAllowedBackpackWeight=" + maxAllowedBackpackWeight +
                ", ticketPrice=" + ticketPrice + // Include ticket price in the output
                '}';
    }
}
package booking;

public class MovieTicketClient extends Thread {

    private MovieTicketServer movieTicketServer;
    private String name;
    private int numOfTickets;

    public MovieTicketClient(MovieTicketServer movieTicketServer, String name, int numOfTickets) {
        // TBD
        this.movieTicketServer = movieTicketServer;
        this.name = name;
        this.numOfTickets = numOfTickets;
    }

    public void run() {
        movieTicketServer.bookTicket(this.name, this.numOfTickets);
    }
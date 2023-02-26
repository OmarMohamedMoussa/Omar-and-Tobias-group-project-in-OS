package booking;

public class MovieTicketServer {
    private String movieName;
    private int availableSeats;

    public MovieTicketServer(String movieName, int availableSeats){
        this.movieName = movieName;
        this.availableSeats = availableSeats;
    }

    public void bookTicket(String customerName, int numberOfSeats){
        System.out.println("Hi," + customerName+ ": " + availableSeats + "Seats available for" + movieName);

        if (numberOfSeats > availableSeats) {
            System.out.println("Hi," + customerName+ ": Seats not available for " + movieName);
            return;
        }
        availableSeats -= numberOfSeats;
        System.out.println("Hi," + customerName+ ": " + numberOfSeats + "Seats booked successfully for" + movieName);
    }

}
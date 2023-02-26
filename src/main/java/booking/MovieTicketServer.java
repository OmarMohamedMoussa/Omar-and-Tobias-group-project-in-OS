package booking;

public class MovieTicketServer {

    // Instance variables to store the movie name and number of available seats
    private String movieName;
    private int availableSeats;

    // Constructor to initialize the instance variables
    public MovieTicketServer(String movieName, int availableSeats){
        this.movieName = movieName;
        this.availableSeats = availableSeats;
    }

    // Method to book tickets
    public void bookTicket(String customerName, int numberOfSeats){
        System.out.println("Hi," + customerName+ ": " + availableSeats + "Seats available for" + movieName);

        if (numberOfSeats > availableSeats) {
            System.out.println("Hi," + customerName+ ": Seats not available for " + movieName);
            return;
        }
        availableSeats -= numberOfSeats;
        System.out.println("Hi," + customerName+ ": " + numberOfSeats + "Seats booked successfully for" + movieName);
    }

    // Synchronized method to check the available seats
    public synchronized int getAvailableSeats() {
        return availableSeats;
    }

}
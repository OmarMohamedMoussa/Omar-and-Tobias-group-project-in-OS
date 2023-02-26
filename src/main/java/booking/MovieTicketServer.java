package booking;

import java.util.HashMap;
import java.util.Map;

public class MovieTicketServer {


    private int availableSeats;
    private Map<String, Integer> seatsBooked = new HashMap<>();


    public void (String movieName) {
        name = movieName;
    }

    public String getName() {
        return name;
    }

    public void setName(String movieName) {
        name = movieName;
    }

    public MovieTicketServer() {

    }


    public synchronized boolean bookTicket(String userName, int numSeats) {
        if (numSeats <= availableSeats) {
            availableSeats -= numSeats;
            int seatsAlreadyBooked = seatsBooked.getOrDefault(userName, 0);
            seatsBooked.put(userName, seatsAlreadyBooked + numSeats);
            return true;
        } else {
            return false;
        }
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public Map<String, Integer> getSeatsBooked() {
        return seatsBooked;
    }



    MovieTicketServer ticketServer = new MovieTicketServer(100);
    String userName = "John";
    int numSeatsToBook = 2;
    boolean bookingResult = ticketServer.bookTicket(userName, numSeatsToBook);

    if (bookingResult) {
        System.out.println("Booking successful! " + userName + " booked " + numSeatsToBook + " seats.");
    } else {
        System.out.println("Booking failed. Not enough seats available.");
    }


}
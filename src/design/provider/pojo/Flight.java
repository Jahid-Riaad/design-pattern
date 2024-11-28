package design.provider.pojo;

public class Flight {
    private String flightNumber;
    private String airline;
    private String origin;
    private String destination;
    private double price;
    private String departureTime;
    private String arrivalTime;

    public Flight(String flightNumber, String airline, String origin, String destination, double price, String departureTime, String arrivalTime) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    // Getters and setters
    public String getFlightNumber() { return flightNumber; }
    public String getAirline() { return airline; }
    public String getOrigin() { return origin; }
    public String getDestination() { return destination; }
    public double getPrice() { return price; }
    public String getDepartureTime() { return departureTime; }
    public String getArrivalTime() { return arrivalTime; }
}
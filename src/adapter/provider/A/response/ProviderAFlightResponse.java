package adapter.provider.A.response;

import adapter.provider.pojo.Flight;

import java.util.ArrayList;
import java.util.List;

public class ProviderAFlightResponse {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(String flightNumber, String airline, String origin, String destination,
                          double price, String departureTime, String arrivalTime) {
        flights.add(new Flight(flightNumber, airline, origin, destination, price, departureTime, arrivalTime));
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
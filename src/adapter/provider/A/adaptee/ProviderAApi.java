package adapter.provider.A.adaptee;

import adapter.provider.A.response.ProviderAFlightResponse;
import adapter.provider.A.response.ProviderAHotelResponse;
import adapter.provider.A.response.ProviderARentalResponse;

import java.util.Date;

public class ProviderAApi {

    public ProviderAHotelResponse fetchHotels(String location, Date checkIn, Date checkOut) {
        // Simulate an API response for hotels
        ProviderAHotelResponse response = new ProviderAHotelResponse();
        response.addHotel("adapter.adapter.pojo.provider.Hotel A1", location, 120.50, 4, true);
        response.addHotel("adapter.adapter.pojo.provider.Hotel A2", location, 95.00, 3, true);
        return response;
    }

    public ProviderAFlightResponse fetchFlights(String origin, String destination, Date departure) {
        // Simulate an API response for flights
        ProviderAFlightResponse response = new ProviderAFlightResponse();
        response.addFlight("A123", "Airline A", origin, destination, 250.00, "08:00 AM", "10:30 AM");
        return response;
    }

    public ProviderARentalResponse fetchVacationRentals(String location, Date startDate, Date endDate) {
        // Simulate an API response for vacation rentals
        ProviderARentalResponse response = new ProviderARentalResponse();
        response.addRental("Rental A1", location, 4, 150.00, true, true);
        return response;
    }
}

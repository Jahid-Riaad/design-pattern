package adapter.provider.A;

import adapter.ProviderAdapter;
import adapter.provider.A.response.ProviderAFlightResponse;
import adapter.provider.A.response.ProviderAHotelResponse;
import adapter.provider.A.response.ProviderARentalResponse;
import adapter.provider.A.adaptee.ProviderAApi;
import adapter.provider.pojo.Flight;
import adapter.provider.pojo.Hotel;
import adapter.provider.pojo.VacationRental;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class ProviderAAdapter implements ProviderAdapter {
    private ProviderAApi providerAApi;

    public ProviderAAdapter(ProviderAApi providerAApi) {
        this.providerAApi = providerAApi;
    }

    @Override
    public List<Hotel> getHotels(String location, Date checkIn, Date checkOut) {
        ProviderAHotelResponse response = providerAApi.fetchHotels(location, checkIn, checkOut);
        return transformHotels(response);
    }

    @Override
    public List<Flight> getFlights(String origin, String destination, Date departure) {
        ProviderAFlightResponse response = providerAApi.fetchFlights(origin, destination, departure);
        return transformFlights(response);
    }

    @Override
    public List<VacationRental> getVacationRentals(String location, Date startDate, Date endDate) {
        ProviderARentalResponse response = providerAApi.fetchVacationRentals(location, startDate, endDate);
        return transformVacationRentals(response);
    }

    // Transform adapter.adapter.A.Response.provider.ProviderAHotelResponse (Hotels)
    private List<Hotel> transformHotels(ProviderAHotelResponse response) {
        List<Hotel> hotels = new ArrayList<>();
        for (Hotel providerAHotel : response.getHotels()) {
            Hotel hotel = new Hotel(
                    providerAHotel.getName(),
                    providerAHotel.getLocation(),
                    providerAHotel.getPrice(),
                    providerAHotel.getRating(),
                    providerAHotel.isAvailable()
            );
            hotels.add(hotel);
        }
        return hotels;
    }

    // Transform adapter.adapter.A.Response.provider.ProviderAFlightResponse (Flights)
    private List<Flight> transformFlights(ProviderAFlightResponse response) {
        List<Flight> flights = new ArrayList<>();
        for (Flight providerAFlight : response.getFlights()) {
            Flight flight = new Flight(
                    providerAFlight.getFlightNumber(),
                    providerAFlight.getAirline(),
                    providerAFlight.getOrigin(),
                    providerAFlight.getDestination(),
                    providerAFlight.getPrice(),
                    providerAFlight.getDepartureTime(),
                    providerAFlight.getArrivalTime()
            );
            flights.add(flight);
        }
        return flights;
    }

    // Transform adapter.adapter.A.Response.provider.ProviderARentalResponse (Vacation Rentals)
    private List<VacationRental> transformVacationRentals(ProviderARentalResponse response) {
        List<VacationRental> rentals = new ArrayList<>();
        for (VacationRental providerARental : response.getRentals()) {
            VacationRental rental = new VacationRental(
                    providerARental.getName(),
                    providerARental.getLocation(),
                    providerARental.getMaxOccupancy(),
                    providerARental.getPrice(),
                    providerARental.hasPool(),
                    providerARental.isAvailable()
            );
            rentals.add(rental);
        }
        return rentals;
    }
}

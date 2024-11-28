package adapter;

import adapter.provider.pojo.Flight;
import adapter.provider.pojo.Hotel;
import adapter.provider.pojo.VacationRental;

import java.util.Date;
import java.util.List;

public interface ProviderAdapter {
    List<Hotel> getHotels(String location, Date checkIn, Date checkOut);
    List<Flight> getFlights(String origin, String destination, Date departure);
    List<VacationRental> getVacationRentals(String location, Date startDate, Date endDate);
}

package design.adapter;

import design.provider.pojo.Flight;
import design.provider.pojo.Hotel;
import design.provider.pojo.VacationRental;

import java.util.Date;
import java.util.List;

public interface ProviderAdapter {
    List<Hotel> getHotels(String location, Date checkIn, Date checkOut);
    List<Flight> getFlights(String origin, String destination, Date departure);
    List<VacationRental> getVacationRentals(String location, Date startDate, Date endDate);
}

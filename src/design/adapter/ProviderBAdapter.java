package design.adapter;

import design.provider.Response.B.ProviderBHotelResponse;
import design.provider.pojo.Flight;
import design.provider.pojo.Hotel;
import design.provider.pojo.VacationRental;
import design.provider.adaptee.ProviderBApi;
import design.provider.Response.B.ProviderBVacationResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class ProviderBAdapter implements ProviderAdapter {
    private ProviderBApi providerBApi;

    public ProviderBAdapter(ProviderBApi providerBApi) {
        this.providerBApi = providerBApi;
    }

    @Override
    public List<Hotel> getHotels(String location, Date checkIn, Date checkOut) {
        ProviderBHotelResponse response = providerBApi.getHotelData(location, checkIn, checkOut);
        return transformHotels(response);
    }

    @Override
    public List<Flight> getFlights(String origin, String destination, Date departure) {
        // Assuming design.provider.adaptee.ProviderBApi doesn't support flight data in this example
        return new ArrayList<>();
    }

    @Override
    public List<VacationRental> getVacationRentals(String location, Date startDate, Date endDate) {
        ProviderBVacationResponse response = providerBApi.getVacationRentals(location, startDate, endDate);
        return transformVacationRentals(response);
    }

    // Transform design.provider.Response.B.ProviderBHotelResponse (Hotels) to your design.provider.pojo.Hotel POJO
    private List<Hotel> transformHotels(ProviderBHotelResponse response) {
        List<Hotel> hotels = new ArrayList<>();
        for (Hotel hotelData : response.getHotels()) {
            Hotel hotel = new Hotel(
                    hotelData.getName(),
                    hotelData.getLocation(),
                    hotelData.getPrice(),
                    hotelData.getRating(),
                    hotelData.isAvailable()
            );
            hotels.add(hotel);
        }
        return hotels;
    }

    // Transform design.provider.Response.B.ProviderBVacationResponse (Vacation Rentals) to your design.provider.pojo.VacationRental POJO
    private List<VacationRental> transformVacationRentals(ProviderBVacationResponse response) {
        List<VacationRental> rentals = new ArrayList<>();
        for (VacationRental rentalData : response.getRentals()) {
            VacationRental rental = new VacationRental(
                    rentalData.getName(),
                    rentalData.getLocation(),
                    rentalData.getMaxOccupancy(),
                    rentalData.getPrice(),
                    rentalData.hasPool(),
                    rentalData.isAvailable()
            );
            rentals.add(rental);
        }
        return rentals;
    }
}

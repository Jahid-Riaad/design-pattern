package adapter.provider.B;

import adapter.ProviderAdapter;
import adapter.provider.B.response.ProviderBHotelResponse;
import adapter.provider.B.response.ProviderBVacationResponse;
import adapter.provider.B.adaptee.ProviderBApi;
import adapter.provider.pojo.Flight;
import adapter.provider.pojo.Hotel;
import adapter.provider.pojo.VacationRental;

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
        // Assuming adapter.adapter.adaptee.provider.ProviderBApi doesn't support flight data in this example
        return new ArrayList<>();
    }

    @Override
    public List<VacationRental> getVacationRentals(String location, Date startDate, Date endDate) {
        ProviderBVacationResponse response = providerBApi.getVacationRentals(location, startDate, endDate);
        return transformVacationRentals(response);
    }

    // Transform adapter.adapter.B.Response.provider.ProviderBHotelResponse (Hotels) to your adapter.adapter.pojo.provider.Hotel POJO
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

    // Transform adapter.adapter.B.Response.provider.ProviderBVacationResponse (Vacation Rentals) to your adapter.adapter.pojo.provider.VacationRental POJO
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

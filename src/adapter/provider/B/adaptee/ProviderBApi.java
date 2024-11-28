package adapter.provider.B.adaptee;

import adapter.provider.B.response.ProviderBHotelResponse;
import adapter.provider.B.response.ProviderBVacationResponse;

import java.util.Date;

public class ProviderBApi {

    public ProviderBHotelResponse getHotelData(String location, Date checkIn, Date checkOut) {
        // Simulate an API response for hotels
        ProviderBHotelResponse response = new ProviderBHotelResponse();
        response.addHotel("adapter.adapter.pojo.provider.Hotel B1", location, 110.00, 3, true);
        response.addHotel("adapter.adapter.pojo.provider.Hotel B2", location, 130.00, 5, false);
        return response;
    }

    public ProviderBVacationResponse getVacationRentals(String location, Date startDate, Date endDate) {
        // Simulate an API response for vacation rentals
        ProviderBVacationResponse response = new ProviderBVacationResponse();
        response.addRental("Rental B1", location, 6, 200.00, false, true);
        response.addRental("Rental B2", location, 2, 85.00, false, false);
        return response;
    }
}

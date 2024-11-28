package design.provider.adaptee;

import design.provider.Response.B.ProviderBHotelResponse;
import design.provider.Response.B.ProviderBVacationResponse;

import java.util.Date;

public class ProviderBApi {

    public ProviderBHotelResponse getHotelData(String location, Date checkIn, Date checkOut) {
        // Simulate an API response for hotels
        ProviderBHotelResponse response = new ProviderBHotelResponse();
        response.addHotel("design.provider.pojo.Hotel B1", location, 110.00, 3, true);
        response.addHotel("design.provider.pojo.Hotel B2", location, 130.00, 5, false);
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

package design.provider.Response.A;

import design.provider.pojo.Hotel;

import java.util.ArrayList;
import java.util.List;

public class ProviderAHotelResponse {
    private List<Hotel> hotels = new ArrayList<>();

    public void addHotel(String name, String location, double price, int rating, boolean isAvailable) {
        hotels.add(new Hotel(name, location, price, rating, isAvailable));
    }

    public List<Hotel> getHotels() {
        return hotels;
    }
}
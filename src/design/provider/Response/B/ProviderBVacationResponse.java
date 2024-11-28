package design.provider.Response.B;

import design.provider.pojo.VacationRental;

import java.util.ArrayList;
import java.util.List;

public class ProviderBVacationResponse {
    private List<VacationRental> rentals = new ArrayList<>();

    public void addRental(String name, String location, int maxOccupancy, double price, boolean hasPool, boolean isAvailable) {
        rentals.add(new VacationRental(name, location, maxOccupancy, price, hasPool, isAvailable));
    }

    public List<VacationRental> getRentals() {
        return rentals;
    }
}
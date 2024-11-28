package adapter.provider.A.response;

import adapter.provider.pojo.VacationRental;

import java.util.ArrayList;
import java.util.List;

public class ProviderARentalResponse {
    private List<VacationRental> rentals = new ArrayList<>();

    public void addRental(String name, String location, int maxOccupancy, double price, boolean hasPool, boolean isAvailable) {
        rentals.add(new VacationRental(name, location, maxOccupancy, price, hasPool, isAvailable));
    }

    public List<VacationRental> getRentals() {
        return rentals;
    }
}
package adapter.client;

import adapter.ProviderAdapter;
import adapter.provider.pojo.Hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OTASystem {
    private List<ProviderAdapter> providers;

    public OTASystem(List<ProviderAdapter> providers) {
        this.providers = providers;
    }

    public List<Hotel> searchHotels(String location, Date checkIn, Date checkOut) {
        List<Hotel> allHotels = new ArrayList<>();
        for (ProviderAdapter provider : providers) {
            allHotels.addAll(provider.getHotels(location, checkIn, checkOut));
        }
        return allHotels;
    }
}

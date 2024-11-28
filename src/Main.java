import adapter.client.OTASystem;
import adapter.provider.A.adaptee.ProviderAApi;
import adapter.provider.B.adaptee.ProviderBApi;
import adapter.ProviderAdapter;
import adapter.provider.pojo.Hotel;
import adapter.provider.A.ProviderAAdapter;
import adapter.provider.B.ProviderBAdapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProviderAdapter> providers = new ArrayList<>();
        providers.add(new ProviderAAdapter(new ProviderAApi()));
        providers.add(new ProviderBAdapter(new ProviderBApi()));

        OTASystem otaSystem = new OTASystem(providers);

        List<Hotel> hotels = otaSystem.searchHotels("New York", new Date(), new Date());
        hotels.forEach(System.out::println);
    }
}

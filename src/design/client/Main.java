package design.client;

import design.adapter.ProviderAdapter;
import design.provider.pojo.Hotel;
import design.adapter.ProviderAAdapter;
import design.provider.adaptee.ProviderAApi;
import design.adapter.ProviderBAdapter;
import design.provider.adaptee.ProviderBApi;

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

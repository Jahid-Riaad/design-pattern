package design.provider.pojo;

public class Hotel {
    private String name;
    private String location;
    private double price;
    private int rating;
    private boolean available;

    public Hotel(String name, String location, double price, int rating, boolean available) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.rating = rating;
        this.available = available;
    }

    // Getters and setters
    public String getName() { return name; }
    public String getLocation() { return location; }
    public double getPrice() { return price; }
    public int getRating() { return rating; }
    public boolean isAvailable() { return available; }
    @Override
    public String toString() {
        return "Hotel Name: " + name + "\n" +
                "Location: " + location + "\n" +
                "Price: $" + price + "\n" +
                "Rating: " + rating + " stars\n" +
                "Available: " + (available ? "Yes" : "No") + "\n";
    }

}
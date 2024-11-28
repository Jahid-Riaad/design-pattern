package design.provider.pojo;

public class VacationRental {
    private String name;
    private String location;
    private int maxOccupancy;
    private double price;
    private boolean hasPool;
    private boolean available;

    public VacationRental(String name, String location, int maxOccupancy, double price, boolean hasPool, boolean available) {
        this.name = name;
        this.location = location;
        this.maxOccupancy = maxOccupancy;
        this.price = price;
        this.hasPool = hasPool;
        this.available = available;
    }

    // Getters and setters
    public String getName() { return name; }
    public String getLocation() { return location; }
    public int getMaxOccupancy() { return maxOccupancy; }
    public double getPrice() { return price; }
    public boolean hasPool() { return hasPool; }
    public boolean isAvailable() { return available; }
}
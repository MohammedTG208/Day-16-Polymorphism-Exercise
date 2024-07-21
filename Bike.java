public class Bike implements Vehicle{
//    For Bike, use an hourly rate of $10.
    private String brand;
    private double hour;

    public Bike(String brand, double hour) {
        this.brand = brand;
        this.hour = hour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public double calculateRentalCost() {
        return hour*10;
    }

    @Override
    public void displayDetails() {
        System.out.println("==========");
        System.out.println("Bike Brand: "+this.brand+"\nRental Rate: "+10+"\nRental Cost:"+this.calculateRentalCost());
        System.out.println("==========");
    }
}

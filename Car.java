public class Car implements Vehicle{
//    For Car, use a daily rate of $50.

    private int days;
    private String model;

    public Car(int days, String model) {
        this.days = days;
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double calculateRentalCost() {
        return days*50;
    }

    @Override
    public void displayDetails() {
        System.out.println("==========");
        System.out.println("Rental Details: "+"\nCar Model: "+this.model+"\nDaily Rental Rate: "+50+"\nRental Cost: "+calculateRentalCost());
        System.out.println("==========");
    }
}

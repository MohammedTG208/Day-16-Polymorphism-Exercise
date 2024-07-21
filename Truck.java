public class Truck implements Vehicle{
//    • For Truck, use a weekly rate of $500.
    private int week;
    private String type;

    public Truck(int week, String type) {
        this.week = week;
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double calculateRentalCost() {
        return week*500;
    }

    @Override
    public void displayDetails() {
        System.out.println("==========");
        System.out.println("Truck type: "+this.type+"\nRental Rate: "+500+"\nRental Cost:"+calculateRentalCost());
        System.out.println("==========");
    }
}
